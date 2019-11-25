package CpuModel;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stackQueue = new LinkedList<>();

    public void put(Integer input) {
        this.stackQueue.add(input);
    }

    public Integer getAndRemove() {
        if(stackQueue.size() == 0)
            throw new IllegalStateException("Can't getAndRemove the value from an empty stack");
        Integer last = stackQueue.getLast();
        stackQueue.remove(last);
        return last;
    }
}
