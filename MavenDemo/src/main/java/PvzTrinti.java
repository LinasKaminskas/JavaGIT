
import com.google.gson.Gson;

/**
 * MavenDemo
 * Created by valdas on 2019-01-10.
 */
public class PvzTrinti {

    public static void main(String[] args) {
        System.out.println("Hi ");

        /*

            {
                "laukas1" : "Pirmas",
                "laukas2" : {
                    "laukas3": 123
                },
                "laukas4": "aaaa"
            }

         */

        String str = "{\"laukas1\":\"Pirmas\", \"laukas2\": {\"laukas3\": 123}, \"laukas4\": \"aaaa\"}";
        Gson gson = new Gson();

        A1 a1 = gson.fromJson(str, A1.class);
        System.out.println(a1.laukas2.laukas3);
    }
}

class A1 {
    String laukas1;
    A2 laukas2;

    @Override
    public String toString() {
        return "A1{" +
                "laukas1='" + laukas1 + '\'' +
                ", laukas2=" + laukas2 +
                '}';
    }
}

class A2 {
    int laukas3;

    @Override
    public String toString() {
        return "A2{" +
                "laukas3=" + laukas3 +
                '}';
    }
}