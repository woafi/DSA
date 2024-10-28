import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] arrTemp = new int[100];
        int j = 0, chk = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Element(" + i + ") : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nEnter the Number to Search: ");
        int num = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                arrTemp[j] = i;  // Store index of found element
                j++;
                chk++;
            }
        }

        if (chk > 0) {
            System.out.println("\n" + num + " Found at Index No. ");
            for (int i = 0; i < chk; i++) {
                System.out.print(arrTemp[i] + " ");
            }
        } else {
            System.out.println("\n" + num + " does not Found!");
        }

        scanner.close();
    }
}
