import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        printToScreen("Iveskite varda:  ");
        String firstName = readFromScreen();
        printToScreen("Iveskite pavarde:  ");
        String lastName = readFromScreen();

    }

    private static void printToScreen(String text) {
        System.out.println(text);
    }

    private static String readFromScreen() {
        Scanner reader = new Scanner(System.in);
        String name = reader.next();
        //reader.close();
        return name;
    }
}
