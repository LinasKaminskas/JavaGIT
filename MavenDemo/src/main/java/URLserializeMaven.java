import com.google.gson.Gson;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;


public class URLserializeMaven {
    public static void main(String... args) throws URISyntaxException, MalformedURLException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite adresa: ");
        String address = scanner.next();

        URI uri = new URI("https",
                "geocoder.api.here.com",
                "/6.2/geocode.json",
                "app_id=EZo8I9lfNpIFYclKBDzf&app_code=l7dnthyCJxm2Z6KM2qynmA&searchtext=" + address,
                null);

        System.out.println(uri);

        URL url = uri.toURL();
        try (
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(
                                url.openStream(), "UTF-8"));

                Writer ou = new FileWriter("C:\\Users\\Nemesis\\IdeaProjects\\MavenDemo\\src\\main\\java\\urlOutput")
        ) {

            String decodedString;
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
                ou.write(decodedString + "\n");
            }
            String str = "{\"MetaInfo\":{\"Timestamp\":2019-01-14T07:30:26.014+0000}}";
            Gson gson = new Gson();
            A1a a1a= gson.fromJson(str, A1a.class);
            System.out.println(a1a.MetaInfo.Timestamp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class A1a {
    A2a MetaInfo;

    @Override
    public String toString() {
        return "A1a{" +
                "MetaInfo=" + MetaInfo +
                '}';
    }
}
class A2a {
    int Timestamp;

    @Override
    public String toString() {
        return "A2a{" +
                "Timestamp='" + Timestamp +
                '}';
    }
}





