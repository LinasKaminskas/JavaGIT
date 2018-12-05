package Kontrolinis.src;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PagangosMain {
    public static void main(String[] args) throws IOException {
//        int sumPadangos = skaitymas();
//        System.out.println(sumPadangos);
    }

    public static int skaitymas() throws IOException {
        String filePath = "C:\\Users\\Nemesis\\IdeaProjects\\Kontrolinis\\res\\PadangosDuomenys";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int aukstis = scanner.nextInt(); //185
        int plotis = scanner.nextInt(); //65
        String indeksas = scanner.next();
        return aukstis;
    }
}

//        Padangos padanga = new Padangos();
//        padanga.setAukstis(scanner.nextInt());
//        padanga.setPlotis(scanner.nextInt());
//        padanga.setGreicioIndeksas(scanner.next());
//
//        int padangosKiekis = scanner.nextInt();
//
//        Padangos[] padangos = new Padangos[padangosKiekis];
//
//        for (int i = 0; i < padangosKiekis; i++) {
//            Padangos padangosSandelyje = new Padangos();
//            padangosSandelyje.setAukstis(scanner.nextInt());
//            padangosSandelyje.setPlotis(scanner.nextInt());
//            padangosSandelyje.setGreicioIndeksas(scanner.next());
//            padangosSandelyje.setKaina(scanner.nextDouble());
//            padangos[i] = padangosSandelyje;
//        }
//        return aukstis;

