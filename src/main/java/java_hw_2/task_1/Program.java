package java_hw_2.task_1;

public class Program {
    public static void main(String[] args) {
        String string1= "This line that i want to cut, cause it is too long";
        String string2 = string1;
        int target = string2.indexOf("it");
        if (target != -1) {
            string2 = string1.substring(0, target);
        }
        String string3 = string2 + "it is perfect";
        System.out.println("str1 = " + string1);
        System.out.println("str2 = " + string2);
        System.out.println("str3 = " + string3);



    }
//    1)
//    Створити змінну string1 = "This line that i want to cut, cause it is too long".
//    Створити рядок string2 у якому має бути розміщено значення рядка string1,
//    Обрізане до "This line that i want to cut, cause".
//    Створити рядок string3 на основі string2 який міститиме значення
//      "This line that don't want to cut, cause it is perfect".
//    Вивести на консоль кожне повідомлення та його довжину.




}
