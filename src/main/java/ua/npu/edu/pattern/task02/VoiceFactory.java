package ua.npu.edu.pattern.task02;

public class VoiceFactory extends AbstractFactory {
    Subtitles getSubtitles(String n) {
        return null;
    }

    Voice getVoice(String n) {
        if (n==null) return null;
        if (n.equalsIgnoreCase("ORIGINAL VOICE")) return new VoiceOriginal();
        if (n.equalsIgnoreCase("UKRAINIAN VOICE")) return new VoiceUkr();
        return null;
    }
}
