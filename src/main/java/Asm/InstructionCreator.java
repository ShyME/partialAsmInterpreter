package Asm;

public class InstructionCreator {
    public static Instruction create(InstructionData data) {
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
}
