package java_hw_6.task_2_2;

interface ITextProcessor {
    String process(String text);

    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}
