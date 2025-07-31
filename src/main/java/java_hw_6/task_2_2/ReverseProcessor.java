package java_hw_6.task_2_2;

public class ReverseProcessor implements ITextProcessor{
    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
