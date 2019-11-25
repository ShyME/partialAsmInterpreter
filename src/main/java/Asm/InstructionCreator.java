package Asm;

import org.mariuszgromada.math.mxparser.Expression;

public class InstructionCreator {
    public static Instruction create(InstructionData data) {
        data = calculateData(data);
        Instruction instruction;
        switch(data.getType()) {
            case "xor":
                instruction = new Xor();
                instruction.setParams(data.getParam1(), data.getParam2());
                break;
            case "int":
                instruction = new Int();
                instruction.setParams(data.getParam1(), null);
                break;
            case "push":
                instruction = new Push();
                instruction.setParams(data.getParam1(), null);
                break;
            case "mov":
                instruction = new Mov();
                instruction.setParams(data.getParam1(), data.getParam2());
                break;
            default:
                throw new IllegalArgumentException("There's no instruction associated with " + data.getType() + " instructionType");
        }
        return instruction;
    }

    private static InstructionData calculateData(InstructionData data) {
        InstructionData calculatedData = new InstructionData();
        calculatedData.setType(data.getType());
        calculatedData.setParam2(data.getParam2());
        if(data.getParam1().contains("????"))
            calculatedData.setParam1(null);
        else
            calculatedData.setParam1(calculateExpression(data.getParam1()));
        return calculatedData;
    }

    private static String calculateExpression(String param1) {
        Integer result;
        Expression e = new Expression(param1);
        result = (int) e.calculate();
        return result.toString();
    }
}
