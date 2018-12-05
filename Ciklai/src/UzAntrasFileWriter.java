package Ciklai.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//2. Parašyti programa kuri nuskaitytų iš failo duomenis ir įrašytų į kitą
//failą.


public class UzAntrasFileWriter {
    public static void main(String[] args) throws IOException {
        String fileName ="C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas";
        String content = "12345 1528 5863";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        System.out.println("Done");
        bw.close();
        fw.close();

    }
}
