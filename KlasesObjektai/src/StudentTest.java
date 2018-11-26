public class StudentTest {
    public static void main(String[] args) {
        int[] pazymiai = {5, 8, 10, 6, 8};
        int[] lankomumas = {0, -1, 0, -1, 0, 0};
        int sum = Student.pazymiaiElementSum(pazymiai);
        int average = Student.pazymiaiAverage(pazymiai);
        int lankomumasNe = Student.lankomumasNe(lankomumas);
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        System.out.println("Klase:  " + student.getKlase());
        System.out.println("Pazymiu vidurkis:  " + average);
        System.out.println("Lankomumas - praleista paskaitu: " + lankomumasNe);
    }
}
