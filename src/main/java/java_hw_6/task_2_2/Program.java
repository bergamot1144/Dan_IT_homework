package java_hw_6.task_2_2;

public class Program {
    public static void main(String[] args) {
        String text = "             Etiam semper odio vitae sem efficitur laoreet. " +
                "Fusce faucibus faucibus elementum." +
                " Pellentesque mollis nunc vitae neque aliquet, non porttitor nisi..           ";

        ITextProcessor upperText = new UpperCaseProcessor();
        ITextProcessor reverseText = new ReverseProcessor();
        ITextProcessor trimText = new TrimProcessor();

        System.out.println(upperText.process(text));
        System.out.println(reverseText.process(text));
        System.out.println(trimText.process(text));

        System.out.println(upperText.removeDigits(text));
        System.out.println(reverseText.removeDigits(text));
        System.out.println(trimText.removeDigits(text));
    }
}