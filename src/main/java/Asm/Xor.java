package Asm;

import CpuModel.ProcessingUnit;

public class Xor implements Instruction {
    private String param1;
    private String param2;
    private ProcessingUnit processingUnit;

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
            Integer targetRegVal = processingUnit.getRegVal(param2);
            String output = null;
            if(targetRegVal != null)
                output = Integer.toString(Integer.parseInt(param1) ^ targetRegVal);

            Instruction move = new Mov();
            move.setParams(output, param2);
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
            param2 = b.trim();
        } catch(NumberFormatException e) {
            System.out.println("Error");
        }
    }
}
