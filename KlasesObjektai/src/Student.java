package KlasesObjektai.src;

public class Student {
    private String name = "Linas";
    private String lastName = "Kaminskas";
    private String klase = "Pirma";

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getKlase() {
        return klase;
    }

    public static int pazymiaiElementSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int pazymiaiAverage(int[] array) {
        int arrayLenght = array.length;
        int average = pazymiaiElementSum(array) / arrayLenght;
        return average;
    }

    public static int lankomumasNe(int[] lankomumas) {
        int sum = 0;
        for (int i = 0; i < lankomumas.length; i++) {
            sum += lankomumas[i];
            }
            return sum;
        }
    }




