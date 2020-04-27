package App;

import Asm.InstructionData;
import antlr4.AsmLexer;
import antlr4.AsmParser;
import antlr4.ErrorListener;
import antlr4.MyAsmVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Parser {
    private CommonTokenStream tokenStream;
    private AsmLexer asmLexer;
    private AsmParser asmParser;
    private ParseTree tree;
    private MyAsmVisitor asmVisitor;
    private String result;

    public Parser(String input) {
        init(input);
    }

    public InstructionData buildData() {
        try {
            result = asmVisitor.visit(tree);
        } catch(IllegalStateException e) {
            result = e.getMessage().substring(e.getMessage().indexOf("%"));
        }
        InstructionData instructionData = InstructionData.builder()
                .type(asmVisitor.getInstruction())
                .param1(result)
                .param2(asmVisitor.getTargetParam())
                .build();
        return instructionData;
    }

    private void init(String input) {
        asmLexer = new AsmLexer(CharStreams.fromString(input));
        asmLexer.removeErrorListeners();
        asmLexer.addErrorListener(ErrorListener.INSTANCE);
        tokenStream = new CommonTokenStream(asmLexer);
        asmParser = new AsmParser(tokenStream);
        asmParser.removeErrorListeners();
        asmParser.addErrorListener(ErrorListener.INSTANCE);
        tree = asmParser.instruction();
        asmVisitor = new MyAsmVisitor();
    }
}
