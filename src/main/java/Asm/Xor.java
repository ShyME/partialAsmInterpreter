package Asm;

import CpuModel.ProcessingUnit;
import lombok.ToString;

@ToString
public class Xor implements Instruction {
    private String param1;
    private String param2;
    private ProcessingUnit processingUnit;
    private boolean sameRegisters = false;

    public Xor() {
        this.processingUnit = ProcessingUnit.getInstance();
    }

    private boolean isValid() {
        return processingUnit.containsReg(param2);
    }

    @Override
    public void execute() {
        try {
            if(!isValid())
                throw new IllegalStateException("Second parameter of a XOR instruction has to be an existing register");
            Integer targetRegVal;
            String output = null;
            Instruction move = new Mov();
            if(sameRegisters)
                move.setParams("0", param2);
            else if((targetRegVal = processingUnit.getRegVal(param2)) != null) {
                output = Integer.toString(Integer.parseInt(param1) ^ targetRegVal);
                move.setParams(output, param2);
            }
            move.execute();
        } catch(IllegalStateException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void setParams(String a, String b) {
        try {
            if(a == null)
                param1 = null;
            else
                param1 = a.trim();
            if(b == null)
                throw new IllegalArgumentException("Error");
            param2 = b.trim();
            if(a!=null && a.equals(b)) {
                sameRegisters = true;
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Error");
        }
    }
}
