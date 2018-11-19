public class UzPirmaAverageArray {
    public static void main(String[] args) {
        int[] array = {5, 7, 8, 1, 9};
        int arrayLength = array.length;
        //System.out.println(arrayLength);

        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = sum / arrayLength;
        System.out.println("Average value of array elements is: " + average);
        }
    }

