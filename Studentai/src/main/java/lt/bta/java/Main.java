package lt.bta.java;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/Dienynas";
    private static final String USER = "root";
    private static final String PASSWD = "mysql";

    public static void main(String[] args) {

        List<Studentas> studentai = new ArrayList<>();
        int metai = 2018;

        System.out.print("MySQL: ");
        System.out.println(" ");
        uzkrautiDuomenis(studentai);
        System.out.println("--------------------------------");
        System.out.println("kurso vidurkis: ");
        System.out.println(kursoVidurkis(metai));
    }

    private static void uzkrautiDuomenis(List<Studentas> studentai) {

        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWD)
        ) {
            Statement statement = connection.createStatement();
            String select = "select  * from studentai join pazymiai on studentai.Id=pazymiai.studentas_id ";
            //ResultSet resultSet = statement.executeQuery("select  * from studentai join pazymiai on studentai.Id=pazymiai.studentas_id GROUP BY studentai.pavarde, studentai.vardas HAVING studentai.pavarde < 1");
            ResultSet resultSet = statement.executeQuery(select);


            while (resultSet.next()) {
                Studentas studentas = new Studentas();
                studentas.setId(resultSet.getInt("id"));
                studentas.setVardas(resultSet.getString("vardas"));
                studentas.setPavarde(resultSet.getString("pavarde"));
                studentas.setEl_pastas(resultSet.getString("el_pastas"));
                studentas.getPazymiai().add(Integer.valueOf(resultSet.getString("pazymys")));
                studentai.add(studentas);

//                Comparator<Studentas> comparator = new Comparator<Studentas>() {
//                    @Override
//                    public int compare(Studentas o1, Studentas o2) {
//                        return o1.getPavarde().compareTo(o2.getPavarde());
//                    }
//                };
//
//                Collections.sort(studentai, comparator);
//
//                for (Studentas item : studentai){
//                    System.out.println(item.getVardas() + item.getPavarde());
//                }



//                String s1 = resultSet.getString("pavarde");
//                String s2 = resultSet.getString("pavarde");
//
//                for (Studentas name : studentai) {
//                    if (s1==(s2)) {
//                        System.out.print("Rikiuojama pagal varda: ");
//                        System.out.print(resultSet.getString("vardas"));
//                        System.out.print(" ");
//                        System.out.println(resultSet.getString("pavarde"));
//                    }
//                    else {
//                        System.out.print("Rikiuojama pagal pavarde: ");
//                        System.out.print(resultSet.getString("pavarde"));
//                        System.out.print(" ");
//                        System.out.println(resultSet.getString("vardas"));
//                    }
//                }

            }
        } catch (
                SQLException e
        ) {
            e.printStackTrace();
        }
        System.out.println(studentai);

    }

    private static int kursoVidurkis(int metai) {
        int vidurkis = 0;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWD)) {

            String selectSQL = "SELECT AVG(pazymys) AS vidurkis FROM pazymiai where YEAR(pazymiai.data)=" + metai;
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = preparedStatement.executeQuery(selectSQL);

            while (resultSet.next()) {
                vidurkis = resultSet.getInt("vidurkis");
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        return vidurkis;
    }

}
