import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Nuskaitymas {
    private static String readElfuSandelys() throws Exception {
        String filePath = "C:\\Users\\Nemesis\\IdeaProjects\\KaleduSenis\\res\\ElfuSandelys";
        return filePath;
    }

    public static List<ElfuSandelys> zaisloPavadinimas() throws Exception { //pridejau List del return zaislas
        File file = new File(readElfuSandelys());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<ElfuSandelys> zaislas = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            ElfuSandelys elfuSandelys = new ElfuSandelys();
            elfuSandelys.setZaisloPavadinimas(values[0]);
            elfuSandelys.setKiekis(values[1]);
            System.out.println("Zaislo pavadinimas: " + elfuSandelys.getZaisloPavadinimas());
            System.out.println("Zaislu kiekis: " + elfuSandelys.getKiekis());
        }
        br.close();
        return zaislas; //dar nezinau ar teisingai
    }

    private static String readVaikoCharakteristika() throws Exception {
        String filePath = "C:\\Users\\Nemesis\\IdeaProjects\\KaleduSenis\\res\\VaikoCharakteristika";
        return filePath;
    }

    public static List<VaikoCharakteristika> vaikoCharakteristika() throws Exception {
        File file = new File(readVaikoCharakteristika());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<VaikoCharakteristika> charakteris = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            VaikoCharakteristika vaikoCharakteristika = new VaikoCharakteristika();
            vaikoCharakteristika.setVardas(values[0]);
            vaikoCharakteristika.setPavarde(values[1]);
            vaikoCharakteristika.setArBuvoGeras(values[2]);
            System.out.println("Vardas Pavarde: " + vaikoCharakteristika.getVardas() + " " + vaikoCharakteristika.getPavarde());
            System.out.println("Ar buvo geras: " + vaikoCharakteristika.getArBuvoGeras());
        }
        return charakteris;
    }

    private static String readVaikuNorai() throws Exception {
        String filePath = "C:\\Users\\Nemesis\\IdeaProjects\\KaleduSenis\\res\\VaikuNorai";
        return filePath;
    }

    public static List<VaikuNorai> vaikuNorai() throws Exception {
        File file = new File(readVaikuNorai());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<VaikuNorai> norai = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(", ");
            int metaiInt=Integer.parseInt(values[2]);  //keitimas metu String to int
            VaikuNorai vaikuNorai = new VaikuNorai();
            if (metaiInt<15){
                vaikuNorai.setVardas(values[0]);
                vaikuNorai.setPavarde(values[1]);
                vaikuNorai.setMetai(metaiInt);
                vaikuNorai.setAdresas(values[3]);
                vaikuNorai.setKaleduNoras(values[4]);
                norai.add(vaikuNorai);
            } else {
                System.out.println("Daugiau nei 15 metu, norus vykdo tevai");


            }
            System.out.println("Vardas Pavarde: " + vaikuNorai.getVardas() + " " + vaikuNorai.getPavarde());
            System.out.println("Kiek metu: " + vaikuNorai.getMetai());
            System.out.println("Adresas: " + vaikuNorai.getAdresas());
            System.out.println("Kaledu noras: " + vaikuNorai.getKaleduNoras());
        }
        return norai;
    }
}











