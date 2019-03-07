//package lt.bta.java;
//
//import java.sql.*;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//
//    private static final String URL = "jdbc:mysql://localhost:3306/Dienynas";
//    private static final String USER = "root";
//    private static final String PASSWD = "mysql";
//
//    public static void main(String[] args) {
//
//        // List<Studentas> studentai = new ArrayList<>();
//        Map<Integer, Studentas> studentai = uzkrautiDuomenis();
//        int metai = 2018;
//
//        System.out.print(studentai.values());
//        System.out.println(" ");
//
//        uzkrautiDuomenis();
//        System.out.println("--------------------------------");
//
//        System.out.println("kurso vidurkis: ");
//        System.out.println(metai + "m. pazymiu vidurkis" + kursoVidurkis(metai));
//    }
//
//    private static Map<Integer, Studentas> uzkrautiDuomenis() {
//
//        try (
//                Connection connection = DriverManager.getConnection(URL, USER, PASSWD)
//        ) {
//            Statement statement = connection.createStatement();
//            String select = "select  * from studentai join pazymiai on studentai.Id=pazymiai.studentas_id ";
//            //ResultSet resultSet = statement.executeQuery("select  * from studentai join pazymiai on studentai.Id=pazymiai.studentas_id GROUP BY studentai.pavarde, studentai.vardas HAVING studentai.pavarde < 1");
//            ResultSet resultSet = statement.executeQuery(select);
//
//            Map<Integer, Studentas> studentai = new HashMap<>();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                Studentas studentas = new Studentas();
//                List<Pazymiai> pazymiai = new ArrayList<>();
//
//                if (!studentai.containsKey(id)){
//                    studentas.setId(id);
//                    studentas.setVardas(resultSet.getString("vardas"));
//                    studentas.setPavarde(resultSet.getString("pavarde"));
//                    studentas.setEl_pastas(resultSet.getString("el_pastas"));
//                    studentas.setPazymys(pazymiai);
//                    studentai.put(id, studentas);
//                }
//
//                int studId  = resultSet.getInt("studentas_id");
//                Pazymiai pazymys = new Pazymiai();
//                pazymys.setStudentasId(studId);
//                pazymys.setData(LocalDate.parse(resultSet.getString("data")));
//                pazymys.setPazymys(resultSet.getInt("pazymys"));
//                studentai.get(studId).getPazymys().add(pazymys);
//            }
//            return studentai;
//        } catch (
//                SQLException e
//        ) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private static int kursoVidurkis(int metai) {
//        int vidurkis = 0;
//        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWD)) {
//
//            String selectSQL = "SELECT AVG(pazymys) AS vidurkis FROM pazymiai where YEAR(pazymiai.data)=" + metai;
//            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
//            ResultSet resultSet = preparedStatement.executeQuery(selectSQL);
//
//            while (resultSet.next()) {
//                vidurkis = resultSet.getInt("vidurkis");
//            }
//        } catch (
//                SQLException e) {
//            e.printStackTrace();
//        }
//        return vidurkis;
//    }
//
//}
