public class towerOfHanoi {
    public static void func(int n, String source, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return;
        }
        func(n - 1, source, dest, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
        func(n - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        func(3, "S", "H", "D");
    }

}
