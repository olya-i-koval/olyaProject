package ua.npu.edu.pattern.task02;

public class App {
    public static void main(String[] args) {
        AbstractFactory subtitleFactory = FactoryGenerator.getFactory("Original");
        Subtitles subtitles = subtitleFactory.getSubtitles("Original subtitle");
        subtitles.makeSubtitle();
    }
}

