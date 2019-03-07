package lt.bta.java.Egzaminas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Linas Kaminskas linaskamin@gmail.com
 * @version 1.0                 (current version number of program)
 * @since 1.0          (the version of the package this class was first added to)
 */


public class MainEgz {
    /*prisijungimas prie duomenu bazes*/
    private static final String URL = "jdbc:mysql://localhost:3306/miestas";
    private static final String USER = "root";
    private static final String PASS = "mysql";

    public static void main(String[] args) {

        List gyventojai = uzkrautiDuomenis();
        System.out.println(gyventojai);

        System.out.println();
    }

    /**
     * Kolekcijos užpildymas iš MySQL duomenų bazęs
     * Išvedimas grupuojamas pagal tautybę, jei vienoda pagal gatvę, jei vienodos pagal vardus
     */
    private static List uzkrautiDuomenis() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM gyventojai ORDER BY gyventojai.tautybe, gyventojai.gatve, gyventojai.vardas  ASC ;");

            List<Gyventojas> gyventojai = new ArrayList<>();
            while (resultSet.next()) {
                Gyventojas gyventojas = new Gyventojas();
                gyventojas.setId(resultSet.getInt("id"));
                gyventojas.setVardas(resultSet.getString("vardas"));
                gyventojas.setPavarde(resultSet.getString("pavarde"));
                gyventojas.setGimimo_metai(resultSet.getInt("gimimo_metai"));
                gyventojas.setGatve(resultSet.getString("gatve"));
                gyventojas.setTautybe(resultSet.getString("tautybe"));
                gyventojai.add(gyventojas);
            }
            return gyventojai;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Statinis metodas kuris suskaičiuoja ir grąžina kiek gyventojų atitinkamoje gatvėje
     */
    private static int gyventojaiGatve(String gatve) {
        int gyventojai = 0;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT gyventojai.gatve, COUNT(gyventojai.id) FROM miestas.gyventojai");

            while (resultSet.next()){
                gyventojai=resultSet.getInt("gyventojai");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gyventojai;
    }
}



