package ua.npu.edu.pattern.task02;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SUBTITLE")) return new SubtitleFactory();
        if (factory.equalsIgnoreCase("VOICE")) return new VoiceFactory();
        return null;
    }

}
