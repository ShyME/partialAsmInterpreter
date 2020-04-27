package Asm;

public class InstructionCreator {
    public static Instruction create(InstructionData data) {
        Instruction instruction;
        switch(data.getType()) {
            case "xor":
                instruction = new Xor();
                break;
            case "int":
                instruction = new Int();
                break;
            case "push":
                instruction = new Push();
                break;
            case "mov":
                instruction = new Mov();
                break;
            default:
                //throw new IllegalArgumentException("There's no instruction associated with " + data.getType() + " instructionType");
                throw new IllegalArgumentException("Error");
        }
        instruction.setParams(data.getParam1(), data.getParam2());
        return instruction;
    }
}
