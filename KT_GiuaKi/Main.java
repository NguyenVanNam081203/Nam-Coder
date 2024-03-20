package KT_GiuaKi;

import java.util.Scanner;

public class Main {
    private static int currentProduct = 0;

    public static void main(String[] args) {
        // b) Tạo một mảng với độ dài tối đa là 100 phần tử có kiểu là Product
        Product[] products = new Product[100];
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nChọn một trong các lựa chọn sau:");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Tìm kiếm sản phẩm cao thấp");
            System.out.println("3.Tìm kiếm sản phẩm");
            System.out.println("4.Thoát chương trình");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AddProduct(scanner);
                    break;
                case 2:
                    // SearchMinMax();
                    break;
                case 3:
                    // SearchProduct();
                    break;
                case 4:
                    System.out.println("Goodbye, see you later!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    // a) .Cho phép người dùng nhập vào các thông tin id, name, price, quantity và lưu vào mảng,
    // nếu độ dài mảng đã đạt 100 thì đưa ra thông báo lỗi “CSDL đã đầy”
    private static void AddProduct(Scanner scanner ){
        if(currentProduct >= 100){
            System.out.println("CSDL đã đầy");
            return;
        }

        // Nhập ID
        System.out.print("ID: ");
        int id = scanner.nextInt();

        // Nhập tên
        System.out.print("Tên: ");
        String name = scanner.next();

        // Nhập giá
        System.out.print("Giá tiền: ");
        float price = scanner.nextFloat();

        // Nhập quantity
        System.out.print("Số lượng: ");
        int quantity = scanner.nextInt();
        
        Product[currentProduct]  = new Product(id,name,price,quantity);
        currentProduct++;
    }
}
