public class quickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void function(int arr[], int low, int high) {
        if (low < high) {

            int pidx = partition(arr, low, high);

            function(arr, low, pidx - 1);
            function(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 8, 7, 4, 5, 2, 1 };
        int n = arr.length;

        function(arr, 0, n - 1);
        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
