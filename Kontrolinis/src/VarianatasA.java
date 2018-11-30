import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VarianatasA {
    public static void main(String[] args) throws FileNotFoundException {
        File marsrutai = new File("C:\\Users\\Nemesis\\Downloads\\JavaKontrolinis\\DuomenysA.txt");
        Scanner sca = new Scanner(marsrutai);
        int[] arr = new int[sca.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sca.nextInt();
        }
        for (int duomenys : arr) {
            System.out.println(duomenys);
        }
        int sum = arrayElementSum(arr);
        System.out.println("Atstumas "+ sum);

    }

    public static int arrayElementSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return  sum;
    }
}
