package KlasesObjektai.src;

import java.io.IOException;
import java.io.PrintWriter;

public class TemperaturaTest {
    public static void main(String[] args) throws IOException {
        double[] sausis = {-11.5, -10.3, -12, -6.5, -5, -15.5};
        double[] vasaris = {-16, -14.5, -11, -10.3, -3.5, 0};
        double[] kovas = {-3, -2.5, 0, 5, 9.5, 11.2};

        double averageSausis = KlasesObjektai.src.Temperatura.sausisAverage(sausis);
        System.out.println("Sausis  " + averageSausis);
        double averageVasaris = KlasesObjektai.src.Temperatura.vasarisAverage(vasaris);
        System.out.println("Vasaris  " + averageVasaris);
        double averageKovas = KlasesObjektai.src.Temperatura.kovasAverage(kovas);
        System.out.println("Kovas  " + averageKovas);
        double bendrasAverage = KlasesObjektai.src.Temperatura.bendrasAverage(sausis, vasaris, kovas);
        System.out.println("Bendras matavimu vidurkis:  " + bendrasAverage);

        PrintWriter answer = new PrintWriter ("C:\\Users\\Nemesis\\IdeaProjects\\KlasesObjektai\\res\\AtsakymasTekstas");
        answer.println("Sausis  " + averageSausis + "\n" + "Vasaris  " + averageVasaris + "\n" +"Kovas  " + averageKovas + "\n" + "Bendras matavimu vidurkis:  " + bendrasAverage + "\n");
        answer.close();
        System.out.println("Writing to the file is complete");
    }
}
