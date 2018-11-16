import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UzTreciasAverage {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine())!= null){
            System.out.println(st);
        }
        br.close();
        }
    }

