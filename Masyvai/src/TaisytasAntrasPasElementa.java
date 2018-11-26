package Masyvai.src;

public class TaisytasAntrasPasElementa {
    public static void main(String[] args) {
        int[] myArray = {8, 5, 6, 4, 9, 1, 7};
        int sum = arrayElementsSum(myArray);
        System.out.println("Sum average elements:  " + sum);
        double average = arrayAverage(myArray);
        System.out.println("Average value of array elements is: " + average);
        int[] removeArray =newArray(myArray);
        System.out.println("Vidurkis mazesnis uz masyvo elementus:");
        double removeElements = average;
        int j = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] != removeElements){
                removeArray[j] = myArray[i];
                j++;
            }
        }
        for (int i = 0; i < removeArray.length; i++){
            if (average < removeArray[i]){
                System.out.println(removeArray[i]);
            }
        }
    }

    private static int arrayElementsSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static double arrayAverage(int[] array) {
        double arrayLength = array.length;
        double average = arrayElementsSum(array) / arrayLength;
        return average;
    }

    private static int[] newArray(int[] array) {
        int arraySize = array.length;
        int[] removeArray = new int[arraySize];
        return removeArray;
    }
}








