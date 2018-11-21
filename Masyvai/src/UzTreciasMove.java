
public class UzTreciasMove {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, -1, -2, -3, -4 };
        int arraySize = 8;
        int[] smallerArray = new int[arraySize];
        System.out.println("Masyvas be neigiamu skaiciu:");
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] > 0){
                smallerArray[i] = myArray[i];
                System.out.println(smallerArray[i]);
            }
        }
        System.out.println("Perkelti neigiami skaiciai:");
        int[] negativeArray = new  int[arraySize];
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] < 0) {
                negativeArray[i] = myArray[i];
                System.out.println(negativeArray[i]);
            }
        }

    }
}





