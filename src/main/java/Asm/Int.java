package Asm;

import CpuModel.ProcessingUnit;
import lombok.ToString;

@ToString
public class Int implements Instruction {
    private String intCode;
    private ProcessingUnit processingUnit;

    public Int() {
        this.processingUnit = ProcessingUnit.getInstance();
    }

    private boolean isValid() {
        if(!intCode.equals("0x80"))
            throw new IllegalArgumentException("Interruption parameter has to equal 0x80");
        return true;
    }

    @Override
    public void execute() {
        try {
            if(isValid()) {
                Integer stackValue = processingUnit.getAndRemoveStackValue();
                String output = stackValue == null ? "???" : stackValue.toString();
                System.out.println(output);
            }
        } catch(IllegalStateException | IllegalArgumentException e) {
            System.out.println("Error");
        }
    }

    @Override
    public void setParams(String a, String b) {
        if(b != null) //throw new IllegalArgumentException("Second argument of an INT instruction has to be null!");
            throw new IllegalArgumentException("Error");
        setParam(a);
    }

    private void setParam(String param) {
        if(param == null)
            throw new IllegalArgumentException("Error");
        this.intCode = param.trim();
    }
}
