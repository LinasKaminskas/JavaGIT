import java.util.Scanner;

public class Figuros {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        int P, a, b, c, p;
        double S;
        System.out.println("Iveskite trikampio krastines ilgi: ");
        a = area.nextInt();
        b = 5;
        c = 5;
        P = a + b + c;
        //System.out.println(P);
        p = P / 2;
        S = Math.sqrt(p* (p - a)*(p - b)*(p - c));
        System.out.println(S);

        int Sst, ast, bst;
        System.out.println("Iveskite staciakampio krastines ilgi: ");
        ast = area.nextInt();
        bst = 8;
        Sst = ast*bst;
        System.out.println(Sst);

        double Saps, Raps;
        System.out.println("Iveskite apskritimo spinduli: ");
        Raps = area.nextInt();
        Saps = Math.PI*(Raps * Raps);
        System.out.println(Saps);

    }

}
