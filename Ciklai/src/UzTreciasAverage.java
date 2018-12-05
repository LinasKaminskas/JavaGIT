package Ciklai.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//3. Suskaičiuoti vidurkį iš duomenų esančių tekstiniam faile. Rezultatą
//išsaugoti rezultatų faile

public class UzTreciasAverage {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextInt()){
            System.out.println(scan.nextInt());
            String data ="C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas";
            String vardas = data.substring(0,10);
            System.out.println(vardas);
        }
        }
        fr.close();
    }



