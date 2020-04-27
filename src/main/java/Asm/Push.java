package Asm;

import CpuModel.ProcessingUnit;
import lombok.ToString;

@ToString
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
        if(b != null) //throw new IllegalArgumentException("Second argument of an INT instruction has to be null!");
            throw new IllegalArgumentException("Error");
        setParam(a);
    }

    private void setParam(String param) {
        if(param.matches("%e[a-d]x"))
            this.param = null;
        else if(param != null) {
            try {
                this.param = Integer.parseInt(param);
            } catch (NumberFormatException e) {
                System.out.println("Error");
            }
        }
    }
}
