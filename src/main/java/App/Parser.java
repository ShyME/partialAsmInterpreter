package App;

import Asm.InstructionData;
import antlr4.AsmLexer;
import antlr4.AsmParser;
import antlr4.ErrorListener;
import antlr4.TestingWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Parser {
    private CommonTokenStream tokenStream;
    private AsmLexer asmLexer;
    private AsmParser asmParser;

    public Parser(String input) {
        asmLexer = new AsmLexer(CharStreams.fromString(input));
        asmLexer.removeErrorListeners();
        asmLexer.addErrorListener(ErrorListener.INSTANCE);
        tokenStream = new CommonTokenStream(asmLexer);
        asmParser = new AsmParser(tokenStream);
        asmParser.removeErrorListeners();
        asmParser.addErrorListener(ErrorListener.INSTANCE);

        walkTheTree();
    }

    public static InstructionData getInstructionData(String tokenString) {
        InstructionData data = new InstructionData();

        int whitespaceIndex = tokenString.indexOf(" ");

        data.setType(tokenString.substring(0, whitespaceIndex).trim());
        if(tokenString.contains(",")) {
            int commaIndex = tokenString.indexOf(',');
            data.setParam1(tokenString.substring(whitespaceIndex+1, commaIndex-1).trim());
            data.setParam2(tokenString.substring(commaIndex+1, tokenString.indexOf("<EOF>")-1).trim());
        }
        else {
            data.setParam1(tokenString.substring(whitespaceIndex+1, tokenString.indexOf("<EOF>")-1).trim());
            data.setParam2(null);
        }
        return data;
    }

    private void walkTheTree() {
        ParseTree tree = asmParser.instruction();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new TestingWalker(), tree);
    }

    public String getTokenStreamString() {
        String tokenString = new String();
        for(int i = 0; i < tokenStream.getNumberOfOnChannelTokens(); i++) {
            tokenString += tokenStream.get(i).getText() + " ";
        }
        return tokenString;
    }

    public CommonTokenStream getTokenStream() {
        return tokenStream;
    }
}
