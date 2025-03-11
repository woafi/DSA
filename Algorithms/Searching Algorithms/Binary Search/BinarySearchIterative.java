public class BinarySearchIterative {
    public static void main(String[] args) {
        // Sorted array to perform binary search
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 2;

        // Perform binary search
        int result = binarySearch(arr, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Iterative binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid; // Element found
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If element is not found
        return -1;
    }
}
