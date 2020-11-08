package ua.npu.edu.pattern.task02;

public class UkrainianFactory extends AbstractFactory {
    @Override
    Original getOriginal(String n) {
        return null;
    }

    @Override
    Ukrainian getUkrainian(String n) {
        if (n == null) return null;
        if (n.equalsIgnoreCase("UKRAINIAN SUBTITLES")) return new UkrainianSubtitle();
        if (n.equalsIgnoreCase("UKRAINIAN VOICE")) return new UkrainianVoice();
        return null;
    }
}
