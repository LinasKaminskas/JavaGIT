package Kontrolinis.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class VarianatasA {
    public static void main(String[] args) throws FileNotFoundException {
        File marsrutai = new File("C:\\Users\\Linas\\JavaGit\\JAVAGIT\\Kontrolinis\\res\\DuomenysA.txt");
        Scanner sca = new Scanner(marsrutai);
        int[] arr = new int[sca.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sca.nextInt();
        }
        System.out.println(" ");
        for (int duomenys : arr) {
            System.out.print("Vaziuojami atstumai:  " + Arrays.toString(arr));
            break;
        }
        System.out.println(" ");
        int sum = arrayElementSum(arr);
        System.out.println("Atstumai viso: " + sum+ " m");
        int max = arrayElementsMax(arr);
        System.out.println("Didziausias atstumas yra: " + max+" m");
        int min = arrayElementsMin(arr);
        System.out.println("Maziausias atstumas yra: " + min+" m");

        PrintWriter answerToFile = new PrintWriter("C:\\Users\\Linas\\JavaGit\\JAVAGIT\\Kontrolinis\\res\\DuomenysAanswer.txt");
        answerToFile.println("Atstumai viso: "+sum +" m"+ "\n" + "Didziausias atstumas yra: " + max + " m"+"\n"+ "Maziausias atstumas yra: "+min+" m");
        answerToFile.close();
        System.out.println(" ");
        System.out.println("Writing to file is complete");
    }

    public static int arrayElementSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int arrayElementsMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int duomenys : arr) {
            if (duomenys > max)
                max = duomenys;
        }
        return max;
    }
    public static int arrayElementsMin(int[] arr){
        int min =Integer.MAX_VALUE;
        for (int duomenys : arr){
            if (duomenys < min)
                min =duomenys;
        }
        return min;
    }
}
