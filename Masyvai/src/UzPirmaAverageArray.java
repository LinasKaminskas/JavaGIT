package Masyvai.src;

public class UzPirmaAverageArray {
    public static void main(String[] args) {
        int[] myArray = {88, 7, 8, 1, 9};
        int sum = arrayElementSum(myArray);
        System.out.println(sum);
        double average = arrayAverage(myArray);
        System.out.println("Average value of array elements is:  " + average);
    }
       private static  int arrayElementSum (int[] array) {
           int sum = 0;
           for (int i = 0; i < array.length; i++) {
               sum += array[i];
           }
           return sum;
       }
       private  static  double arrayAverage (int[] array){
        double arrayLenght = array.length;
        double average = arrayElementSum(array) / arrayLenght;
        return average;
       }
}



