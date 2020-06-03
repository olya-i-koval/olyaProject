package ua.edu.npu.lab04.task0403;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayStack implements Stack {

    public static ArrayList<Integer> a = new ArrayList<>();
    int top = -1;

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(5);
        arrayStack.push(44);
        arrayStack.push(7);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + "  ");
        }
        arrayStack.pop();
        arrayStack.size();
        arrayStack.isEmpty();
        arrayStack.clear();
    }


    @Override
    public void push(int data) {
        a.add(0, data);
        top = 0;
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

