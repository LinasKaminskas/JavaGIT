import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Marsrutai {

    File marsrutai = new File("C:\\Users\\Nemesis\\Downloads\\JavaKontrolinis\\DuomenysA.txt");
    Scanner sca = new Scanner(marsrutai);
    int[] arr = new int[sca.nextInt()];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = sca.nextInt();
    }

}
