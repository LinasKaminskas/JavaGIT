import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        Nuskaitymas.zaisloPavadinimas();
        System.out.println("--------------------------------------");
        Nuskaitymas.vaikoCharakteristika();
        System.out.println("--------------------------------------");
        Nuskaitymas.vaikuNorai();
        System.out.println("--------------------------------------");
        Nuskaitymas.UzsalymaiZaislu();
        PrintWriter zaislas = new PrintWriter("C:\\Users\\Nemesis\\IdeaProjects\\KaleduSenis\\res\\UzsakymaiZaislu");
        zaislas.print(Nuskaitymas.UzsalymaiZaislu());
        zaislas.close();

    }
}
