package java_hw_6.task_2_2;

public class TrimProcessor implements ITextProcessor{
    @Override
    public String process(String text) {
        return text.trim();
    }
}
