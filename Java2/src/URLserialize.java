import com.google.gson.Gson;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class URLserialize {
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

                Writer ou = new FileWriter("C:\\Users\\Nemesis\\IdeaProjects\\Java2\\src\\JsonFile")
        ) {

            String decodedString;
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
                ou.write(decodedString + "\n");
            }
//            Gson gson = new Gson();
//            String jsonInString = "{\"PostalCode\":\"44301\"}";
//            URLserialize user =gson.fromJson(jsonInString, URLserialize.class);
            


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
