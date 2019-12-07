package antlr4;

import CpuModel.ProcessingUnit;
import lombok.Getter;

@Getter
public class MyAsmVisitor extends AsmBaseVisitor<String> {
    private ProcessingUnit processingUnit = ProcessingUnit.getInstance();
    private String targetParam;
    private String instruction;
    @Override
    public String visitAddition(AsmParser.AdditionContext ctx) {
        return ((Integer) (Integer.parseInt(visit(ctx.addSubtractExpr())) + Integer.parseInt(visit(ctx.multExpr())))).toString();
    }

    @Override
    public String visitSubtraction(AsmParser.SubtractionContext ctx) {
        return ((Integer) (Integer.parseInt(visit(ctx.addSubtractExpr())) - Integer.parseInt(visit(ctx.multExpr())))).toString();
    }

    @Override
    public String visitMultiplication(AsmParser.MultiplicationContext ctx) {
        return ((Integer) (Integer.parseInt(visit(ctx.multExpr())) * Integer.parseInt(visit(ctx.minusExpr())))).toString();
    }

    @Override
    public String visitSignChange(AsmParser.SignChangeContext ctx) {
        return ((Integer) (-1 * Integer.parseInt(visit(ctx.unaryArgument())))).toString();
    }

    @Override
    public String visitReg(AsmParser.RegContext ctx) {
        return processingUnit.getRegVal(ctx.getText()).toString();
    }

    @Override
    public String visitSignedNumb(AsmParser.SignedNumbContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBraces(AsmParser.BracesContext ctx) {
        return visit(ctx.addSubtractExpr());
    }

    @Override
    public String visitHexNumb(AsmParser.HexNumbContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpression(AsmParser.ExpressionContext ctx) {
        return visit(ctx.addSubtractExpr());
    }

    @Override
    public String visitSignedNumber(AsmParser.SignedNumberContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDoubleArgumentInstruction(AsmParser.DoubleArgumentInstructionContext ctx) {
        instruction = ctx.INSTRUCTION_TYPE().getText();
        targetParam = visit(ctx.targetParam());
        return visit(ctx.argument());
    }

    @Override
    public String visitSingleArgumentInstruction(AsmParser.SingleArgumentInstructionContext ctx) {
        instruction = ctx.INSTRUCTION_TYPE().getText();
        return visit(ctx.argument());
    }

    @Override
    public String visitTargetParam(AsmParser.TargetParamContext ctx) {
        return ctx.getText();
    }
}
