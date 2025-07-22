package java_hw_3.task_6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("What program do you want to download? (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();


        System.out.print("What operating system are you using? (Windows, Linux, MacOS): ");
        String os = scanner.nextLine();


        program = program.trim().toLowerCase();
        os = os.trim().toLowerCase();

        boolean progIsReal = true;
        boolean osIsReal = true;
        String link = "";

        switch (program) {
            case "intellij idea":
                switch (os) {
                    case "windows":
                        link = "https://www.jetbrains.com/idea/download/#section=windows";
                        break;
                    case "linux":
                        link = "https://www.jetbrains.com/idea/download/#section=linux";
                        break;
                    case "macos":
                        link = "https://www.jetbrains.com/idea/download/#section=mac";
                        break;
                    default:
                        osIsReal = false;
                }
                break;

            case "git":
                switch (os) {
                    case "windows":
                        link = "https://git-scm.com/download/win";
                        break;
                    case "linux":
                        link = "https://git-scm.com/download/linux";
                        break;
                    case "macos":
                        link = "https://git-scm.com/download/mac";
                        break;
                    default:
                        osIsReal = false;
                }
                break;

            case "java":
                switch (os) {
                    case "windows":
                        link = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                        break;
                    case "linux":
                        link = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                        break;
                    case "macos":
                        link = "https://www.oracle.com/java/technologies/javase-jdk11-downloads.html";
                        break;
                    default:
                        osIsReal = false;
                }
                break;

            default:
                progIsReal = false;
        }

        if (!progIsReal) {
            System.out.println("Програми з такою назвою не існує.");
        } else if (!osIsReal) {
            System.out.println("ОС з такою назвою не існує.");
        } else {
            System.out.println("Посилання для завантаження: " + link);
        }

    }
}
