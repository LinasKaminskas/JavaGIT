public class UzKetvirtasRikiavimas {
    public static void main(String[] args) {
        int[] array = {8, 5, -1, 6, 9};
        System.out.println("Rikiavimas mazejimo tvarka:");
        for (int i = 0; i < array.length; i++){
            for (int r = i + 1; r < array.length; r++){
                int num1 = array[i];
                int num2 = array[r];
                if (num1 < num2) {
                    array[r] = num1;
                    array[i] = num2;
                }
            }
        }
        for (int i= 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("Rikiavimas didejimo tvarka:");
        for (int i = 0; i < array.length; i++){
            for (int r = i + 1; r < array.length; r++){
                int num1 = array[i];
                int num2 = array[r];
                if (num1 > num2) {
                    array[r] = num1;
                    array[i] = num2;
                }
            }
        }
        for (int i= 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
