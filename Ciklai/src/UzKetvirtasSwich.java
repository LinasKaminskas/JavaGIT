import java.util.Scanner;

public class UzKetvirtasSwich {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        int skaicius;
        String numSkaicius;
        System.out.println("Iveskite skaiciu nuo 1 iki 5: ");
        skaicius = sk.nextInt();
        switch (skaicius){
            case 1: numSkaicius = "Vienas";
            break;
            case 2: numSkaicius = "Du";
            break;
            case 3: numSkaicius ="Trys";
            break;
            case 4: numSkaicius = "Keturi";
            break;
            case 5: numSkaicius = "Penki";
            break;
            default: numSkaicius = "Reikia ivesti lygini skaiciu nuo 1 iki 5";
        }
        System.out.println(numSkaicius);
    }
}
