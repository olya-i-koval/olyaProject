package ua.npu.edu.pattern.task02;

public class App {
    public static void main(String[] args) {
        AbstractFactory originalFactory = FactoryGenerator.getFactory("Original");
        Original original = originalFactory.getOriginal("Original subtitle");
        original.makeOriginalMovie();
    }
}
