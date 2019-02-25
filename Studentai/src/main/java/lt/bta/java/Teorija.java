package lt.bta.java;

public class Teorija {
    public static void main(String[] args) {
        int x = 1/2;
        System.out.println(x);
        System.out.println("--------------------------");
        int a = 10;
        int b = a++;
        int c = --b;
        System.out.println(c);
        System.out.println("--------------------------");
        int var = false ? 1 : false ?  2 : 3; //pasiskaityti namuose
        System.out.println(var);
        System.out.println("--------------------------");
        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1, 3);
        s += "two";
        System.out.println(s.length()); //pasitikrinti ka reiskia
        System.out.println("--------------------------");

    }
}


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

