package ua.npu.edu.pattern.task02;

public abstract class AbstractFactory {
    abstract Original getOriginal(String n);
    abstract Ukrainian getUkrainian(String n);
}
