import java.util.Scanner;

public class BT2 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }

        if (!isPerfectNumber(n)) {
            System.out.println(n + " không phải là số hoàn hảo.");
        } else {
                System.out.println(n + " là số hoàn hảo.");
        }
    }
}
