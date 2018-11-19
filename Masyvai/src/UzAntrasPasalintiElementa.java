public class UzAntrasPasalintiElementa {
    public static void main(String[] args) {
        int[] array = {8, 5, 6, 4, 9, 1, 7};
        int arrayLength = array.length;
        int sum =0;
        for (int i = 0; i < arrayLength; i++){
            sum += array[i];
        }
        int average = sum / arrayLength;
        System.out.println("Average value of array elements is: " + average);

        int arraySize = arrayLength;
        int[] removeArray = new int[arraySize];
        int removeElements = average;

        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != removeElements){
                removeArray[j] = array[i];
                j++;
            }
        }
        System.out.println("Vidurkis mazesnis uz masyvo elementus:");
        for (int i = 0; i < removeArray.length; i++){
            if (average < removeArray[i]){
                System.out.println(removeArray[i]);
            }
        }
    }
    }

