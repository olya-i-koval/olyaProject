package ua.npu.edu.pattern.task02;

public abstract class AbstractFactory {
    abstract Subtitles getSubtitles(String n);
    abstract Voice getVoice(String n);
}
