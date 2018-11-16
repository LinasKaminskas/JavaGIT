import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UzPenktasEven {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int sum = 0;
        String line = br.readLine();
        while (line != null){
            sum += Integer.parseInt(line);
            sum++;
            line = br.readLine();
        }
        br.close();

        int num = sum;
        int[] even = Integer.toString(num).chars().map(c-> c-'0').toArray(); //konvertoujama i masyva
        for (int d : even){
            for (int i = 0; i < even.length; i++){
                if (d % 2 == 0){
                    System.out.println(" Skaicius lyginis");
                } else {
                    System.out.println(" Skaicius nelyginis");
                }
                System.out.println(d);
            }
        }
    }
}
