package Asm;

import CpuModel.ProcessingUnit;

public class Mov implements Instruction {
    private Integer param1;
    private String param2;
    private ProcessingUnit processingUnit;

    public Mov() {
        this.processingUnit = ProcessingUnit.getInstance();
    }

    public boolean isValid() {
        return processingUnit.containsReg(param2);
    }

    @Override
    public void execute() {
        try {
            if(!isValid())
                throw new IllegalStateException("Second parameter of a MOV instruction has to be an existing register");
            processingUnit.moveToReg(param2, param1);
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
                param1 = Integer.parseInt(a);
            param2 = b.trim();
        } catch(NumberFormatException e) {
            System.out.println("Error");
        }
    }
}
