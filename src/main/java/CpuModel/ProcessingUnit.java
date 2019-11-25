package CpuModel;

import java.util.HashMap;
import java.util.Map;

public class ProcessingUnit {
    private Map<String, Register> registers = new HashMap<>();
    private Stack stack = new Stack();
    private static ProcessingUnit instance;

    private ProcessingUnit() {
        initRegisters();
    }

    public static ProcessingUnit getInstance() {
        if(instance == null)
            instance = new ProcessingUnit();
        return instance;
    }

    public void putAtStack(Integer input) {
        stack.put(input);
    }

    public Integer getAndRemoveStackValue() {
        return stack.getAndRemove();
    }

    public void moveToReg(String regToken, Integer input) {
        if(!containsReg(regToken)) {
            throw new IllegalArgumentException("There is no register associated with " + regToken + " token");
        }
        Register reg = registers.get(regToken);
        reg.setValue(input);
    }

    public Integer getRegVal(String regToken) {
        if(!containsReg(regToken)) {
            throw new IllegalArgumentException("There is no register associated with " + regToken + " token");
        }
        Register reg = registers.get(regToken);
        return reg.getValue();
    }

    public boolean containsReg(String regToken) {
        return registers.containsKey(regToken);
    }

    public String evaluateRegisters(String expression) {
        /*for(Map.Entry<String, Register> entry : registers.entrySet()) {
            String value = entry.getValue().getValue() == null ? "????" : entry.getValue().getValue().toString();
            result = expression.replaceAll(entry.getKey(), value);
        }*/
        for(int i = 0; i < registers.size(); i++) {
            String key = (String) registers.keySet().toArray()[i];
            String value = registers.get(key).getValue() == null ? "????" : registers.get(key).getValue().toString();
            expression = expression.replaceAll(key, value);
        }
        return expression;
    }

    private void initRegisters() {
        this.registers.put("%ebx", new Register("ebx"));
        this.registers.put("%ecx", new Register("ecx"));
        this.registers.put("%edx", new Register("edx"));
    }
}
