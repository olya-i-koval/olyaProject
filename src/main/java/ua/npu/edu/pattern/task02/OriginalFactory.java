package ua.npu.edu.pattern.task02;

public class OriginalFactory extends AbstractFactory {
    @Override
    Original getOriginal(String n) {
        if (n == null) return null;
        if (n.equalsIgnoreCase("ORIGINAL SUBTITLES")) return new OriginalSubtitles();
        if (n.equalsIgnoreCase("ORIGINAL VOICE")) return new OriginalVoice();
        return null;
    }

    @Override
    Ukrainian getUkrainian(String n) {
        return null;
    }
}
