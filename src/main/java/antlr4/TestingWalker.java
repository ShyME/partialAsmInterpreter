package antlr4;

public class TestingWalker extends AsmBaseListener {
    public void enterInstruction(AsmParser.InstructionContext ctx) {
        /*System.out.println( "Entering Instruction: "
                + ctx.INSTRUCTION_TYPE()
                + " " + ctx.expression(0)
                + " " + ctx.expression(1));*/
    }

    public void exitInstruction(AsmParser.InstructionContext ctx) {
        //System.out.println( "Exiting Instruction" );
    }
}