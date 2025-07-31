package java_hw_6.task_2_2;

public class UpperCaseProcessor implements ITextProcessor {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}
