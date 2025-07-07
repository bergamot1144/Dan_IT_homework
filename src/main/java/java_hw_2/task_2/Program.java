package java_hw_2.task_2;

public class Program {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job.";
        String word;
        int word_len;
        int wordNum=0;

        string = string.replace(",","");
        string = string.replace(".","");
        String[] words = string.split(" ");

        for (String w : words){
            word = w;
            word_len = word.length();
            wordNum +=1;
            System.out.println("Слово"+wordNum+ " = " + "("+word+"), " + "Довжина цього слова = "+word_len+".");

        }

        int max = words[0].length();
        boolean a = false;

        for (int w = 1; w < words.length; w++){
            if(words[w].length()>max) {
                a=true;
                break;
            }

        }
        System.out.println(a);
    }
}
