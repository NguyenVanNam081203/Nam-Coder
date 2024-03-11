import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,choice;
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        do{
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Tong 2 so a + b = ");
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.print("Hieu 2 so a - b = ");
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.print("Tich 2 so a * b = ");
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.print("Thuong 2 so a / b = ");
                    System.out.println(a/b);
                    break;
                default:
                    if(choice != 0){
                        System.out.print("Chon lai ngay\n");
                    }
            }
        } while (choice != 0);

    }
}
