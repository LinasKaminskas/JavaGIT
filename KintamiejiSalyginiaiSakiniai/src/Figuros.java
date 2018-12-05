package KintamiejiSalyginiaiSakiniai.src;

import java.util.Scanner;


//Parašyti programa kuri suskaičiuotų:
//1. Trikampio plotą
//2. Stačiakampio plotą
//3. Apskritimo plotą
//Kai kraštinės ilgis įvedamas į konsolę.
//Parašyti programa kuri išspręstų kvadratinę lygtį.
//Parašytų ar įvestas skaičius yra lyginis

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
        if (S%2 == 0 ) {
            System.out.println("Skaicius lyginis");
        } else {
            System.out.println("Skaicius nelyginis");
        }


        int Sst, ast, bst;
        System.out.println("Iveskite staciakampio krastines ilgi: ");
        ast = area.nextInt();
        bst = 8;
        Sst = ast*bst;
        System.out.println(Sst);
        if (Sst%2 == 0 ) {
            System.out.println("Skaicius lyginis");
        } else {
            System.out.println("Skaicius nelyginis");
        }


        double Saps, Raps;
        System.out.println("Iveskite apskritimo spinduli: ");
        Raps = area.nextInt();
        Saps = Math.PI*(Raps * Raps);
        System.out.println(Saps);
        if (Saps%2 == 0) {
            System.out.println("Skaicius lyginis");
        } else {
            System.out.println("Skaicius nelyginis");
        }




    }

}
