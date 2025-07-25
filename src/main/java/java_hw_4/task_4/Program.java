package java_hw_4.task_4;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        String[] names = new String[7];
        names[0] = "Petya";
        names[1] = "Masha";
        names[2] = "Olena";
        names[3] = "Fedor";
        names[4] = "Alex";
        names[5] = "Anton";
        names[6] = "Gleb";

        int[] hours = {10,12,14,16,18,20};

        String[] places = new  String[6];
        places[0] = "school";
        places[1] = "store";
        places[2] = "church";
        places[3] = "fitness centre";
        places[4] = "cinema";
        places[5] = "clinic";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 number from 0 to 6");
        int input1 = scanner.nextInt();
        System.out.println("Input 2 number from 0 to 5");
        int input2 = scanner.nextInt();
        System.out.println("Input 2 number from 0 to 5");
        int input3 = scanner.nextInt();

        String name = names[input1];
        int time = hours[input2];
        String place = places[input3];

        System.out.println(name + " will go to the " + place + " at " + time + " o`clock.");



    }
}
