package java_hw_6.task_2_2;

interface ITextProcessor {
    public String process(String text);

    public default String removeDigits(String text) {
        return text.replace(".", "");
    }
}
