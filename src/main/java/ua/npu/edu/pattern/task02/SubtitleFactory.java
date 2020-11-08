package ua.npu.edu.pattern.task02;

public class SubtitleFactory extends AbstractFactory {

    Subtitles getSubtitles(String n) {
        if (n==null) return null;
        if (n.equalsIgnoreCase("ORIGINAL SUBTITLES")) return new SubtitleOriginal();
        if (n.equalsIgnoreCase("UKRAINIAN SUBTITLES")) return new SubtitleUkr();
        return null;
    }

    Voice getVoice(String n) {
        return null;
    }
}
