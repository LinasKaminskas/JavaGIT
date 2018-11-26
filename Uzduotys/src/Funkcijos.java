import java.util.Scanner;

public class Funkcijos {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:  ");
        int num;
        int kart = 0;
        num = reader.nextInt();
        for (int i = 0; i < array.length; i++){
            if (num == array[i]){
                kart++;
            }
            }  System.out.println("Skaicius " + num + "  yra kartojamas " +  kart + " kartus");

    }
    }

