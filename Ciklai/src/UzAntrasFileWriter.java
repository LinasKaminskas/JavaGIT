import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class UzAntrasFileWriter {
    public static void main(String[] args) throws IOException {
        String fileName ="C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas";
        String content = "Naujas Lorem ipsum\n";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        System.out.println("Done");
        bw.close();
        fw.close();

    }
}
