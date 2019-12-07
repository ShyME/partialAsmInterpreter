package Asm;

import CpuModel.ProcessingUnit;

public class Push implements Instruction {
    private Integer param;
    private ProcessingUnit processingUnit;

    public Push() {
        this.processingUnit = ProcessingUnit.getInstance();
    }

    @Override
    public void execute() {
        processingUnit.putAtStack(param);
    }

    @Override
    public void setParams(String a, String b) {
        setParam(a);
    }

    private void setParam(String param) {
        try {
            if(param == null)
                this.param = null;
            else
                this.param = Integer.parseInt(param);
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}
