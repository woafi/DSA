public class intersectionSort {
    public static void main(String[] args) {
        int[] num = { 6, 3, 8, 7, 4, 5, 2, 1 }; // num=input number

        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            int j = i - 1;
            while (j >= 0 && current < num[j]) {
                num[j + 1] = num[j];
                j--;
            }
            // placement
            num[j + 1] = current;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}