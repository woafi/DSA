public class boubleSort {

    public static void func(int array[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 6, 3, 8, 7, 4, 5, 2, 1 };
        
        func(array, array.length); // fucnction call
        
        System.out.print("Sort Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}