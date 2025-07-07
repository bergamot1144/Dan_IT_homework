package java_hw_2.task_3;

public class Program {
    public static void main(String[] args) {

        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        text = text.toLowerCase();
        String[] array = text.split("a");
        System.out.println(text);

        int count = 0;
        for(String i : array){
           count++;
        }
        System.out.println(count);


    }

}
