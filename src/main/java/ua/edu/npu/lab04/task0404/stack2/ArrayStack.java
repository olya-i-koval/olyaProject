package ua.edu.npu.lab04.task0404.stack2;
import ua.edu.npu.lab04.task0404.Stack;

import java.util.ArrayList;

public class ArrayStack implements Stack {

    public static ArrayList<Integer> a = new ArrayList<>();

    @Override
    public void push(int data) {
        a.add(0, data);

    }

    @Override
    public int pop() {
        a.remove(0);
        return a.get(0);
    }

    @Override
    public int size() {
        return a.size();
    }

    @Override
    public boolean isEmpty() {
        return a.isEmpty();
    }

    @Override
    public void clear() {
        a.clear();
    }
}

