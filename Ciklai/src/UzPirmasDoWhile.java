package Ciklai.src;

//Parašyti programas:
//1. Kurios atspausdintų skaičius nuo vieno iki šimto (panaudojant visus
//ciklo variantus)

public class UzPirmasDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);
    }
}
