import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        System.out.println("Skaiciuotuvo veiksmai: ");
        System.out.println("1 sudetis");
        System.out.println("2 daugyba");

        Scanner reader = new Scanner(System.in);
        System.out.println("Sudetis: ");
        int menu = reader.nextInt();
        int a = reader.nextInt();
        int b = reader.nextInt();
        //int suma = a + b;
        //System.out.println(suma);

        System.out.println("Daugyba: ");
        int c = reader.nextInt();
        int d = reader.nextInt();
        //int daugyba = c * d;
        //System.out.println(daugyba);

        /*int ats;
        switch (menu){
            case 1:  ats = a + b;
            break;;
            case  2: ats = c * d;
            break;;
            System.out.println(ats);
        }*/

    }
}
