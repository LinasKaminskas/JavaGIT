import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner metai = new Scanner(System.in);
        int gm, km;
        System.out.println("Iveskite gimimo metus");
        gm = metai.nextInt();
        km = 2018 - gm;
        System.out.println(km);
        if (km < 18){
            System.out.println("Nepilnametis");
        } else {
            System.out.println("Pilnametis");
        }

    }
}
