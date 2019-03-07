package lt.bta.java;

public class Teorija {
    public static void main(String[] args) {
        int x = 1 / 2;
        System.out.println(x);
        System.out.println("--------------------------1");
        int a = 10;
        int b = ++a;
        int c = b++;
        System.out.println(b);
        System.out.println("--------------------------2");
        int var = false ? 1 : false ? 2 : 3; //pasiskaityti namuose
        System.out.println(var);
        System.out.println("--------------------------3");
        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1, 3);
        s += "two";
        System.out.println(s.length()); //pasitikrinti ka reiskia
        System.out.println("--------------------------4");
        int z = 2;
        switch (z) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
        }
        System.out.println("---------------------------5");
        int var1 = false ? 1 : false ? 2 : 3;
        System.out.println(var1);
        System.out.println("---------------------------6");
        String ab = "value";
        String bc = "value";
        System.out.println(ab == bc);
        System.out.println("---------------------------7");
        int var2 = true ? 1 : false ? 2 : 3;
        System.out.println(var1);
        System.out.println("----------------------------8");
Sez sesio1=new Sez();
sesio1.name="Spring";
Sez sesio2=new Sez();
sesio2.name="Autumn";
sesio1=sesio2;
        System.out.println(sesio1.name);
        System.out.println(sesio2.name);

    }
}
class Sez{
    String name;
}

/**
 * @param userInput
 * @return
 */
//tags JSP zymima <%...%> intarpai (scripletai)
//jeigu String = int +int neteisnga {
// String[] cars = {"Volvo", ...} - teisingas
//public void makeCoffe(int coffe, int sugar) - teisingas
//neautentifikuotas vartotojas tikrinimas - session
//pasiziureti MySQL skaiciu tipus (ne CHAR)
//Pairasyti "protected" - tik klases viduje ir tose klasese kur paveldi?
//margin - atstumas nuo remelio iki kito bloko
//iframe - iterpti turini is nuotolinio saltinio (tinklalapio)
//CSS stiliu geriausia iterpti i tinklalapi su keliais puslapiaisExternal
//nenumeruotas sarasas - ul, ...

