
package ua.npu.edu.pattern.task02;
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("UKRAINIAN")) return new UkrainianFactory();
        if (factory.equalsIgnoreCase("ORIGINAL")) return new OriginalFactory();
        return null;
    }
}
