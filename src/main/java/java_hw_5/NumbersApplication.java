package java_hw_5;

import java.util.Random;
import java.util.Scanner;

class NumbersApplication {

    private String name;

    private int gameNumber;

    String startPhrase = "Input number: ";
    String endPhrase = "Congratulations, %s!";
    String bigPhrase = " Your number is too big. Please, try again.";
    String smallPhrase = "Your number is too small. Please, try again";


    public NumbersApplication(String name) {
        Random random = new Random();
        this.name = name;
        this.gameNumber = random.nextInt(101);
    }
    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(startPhrase);
            int userNumber = scanner.nextInt();

            if(userNumber==gameNumber){
                System.out.printf((endPhrase) + "%n", name);
                break;
            }
            else if(userNumber>gameNumber){
                System.out.println(bigPhrase);
            }
            else System.out.println(smallPhrase);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
