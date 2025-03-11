public class BinarySearchRecursive {
  // Recursive binary search function
  public static int binarySearch(int[] arr, int left, int right, int target) {
    // Base case: if left index is greater than right index, element is not found
    if (left > right) {
      return -1;
    }

    // Find the middle index
    int mid = left + (right - left) / 2;

    // Check if the target is at mid
    if (arr[mid] == target) {
      return mid; // Element found
    }

    // If the target is smaller than mid, it must be in the left half
    if (arr[mid] > target) {
      return binarySearch(arr, left, mid - 1, target);
    }

    // Otherwise, the target must be in the right half
    return binarySearch(arr, mid + 1, right, target);
  }

  public static void main(String[] args) {
    // Sorted array to perform binary search
    int[] arr = { 2, 3, 4, 10, 40 };
    int target = 10;

    // Perform binary search
    int result = binarySearch(arr, 0, arr.length - 1, target);

    // Print the result
    if (result == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }

}
