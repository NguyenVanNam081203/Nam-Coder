import java.util.Scanner;

public class BT1 {
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        System.out.print("Nhap c: ");
        c = scanner.nextInt();
        // a) Tính tổng 3 số
        System.out.print("Tong 3 so a,b,c la: ");
        System.out.println(a+b+c);
        // b) Tìm max
        // Hàm tìm giá trị lớn nhất trong ba số
        int max = findMax(a,b,c);
        System.out.println("Giá trị lớn nhất là: " + max);
    }
}
