package BT_TrenLop;

import java.util.Scanner;

public class ATM {
    private static User[] users = new User[]{
            new User(001, "Nam", "123456", 10000000f),
            new User(002, "Hieu", "123467", 5000000f)
    };

    private static User currentUser; // Thêm biến currentUser để theo dõi người dùng hiện tại.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner.next();

        if (check(id, password)) {
            System.out.print("Welcome " + currentUser.getName());
            showMenu(scanner);
        } else {
            System.out.print("Thông tin đăng nhập không đúng.");
        }
    }

    private static boolean check(int id, String password) {
        for (User user : users) {
            if (user.getId() == id && user.getPassword().equals(password)) {
                currentUser = user; // Gán currentUser bằng người dùng hiện tại
                return true;
            }
        }
        return false;
    }

    private static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nChọn một trong các lựa chọn sau:");
            System.out.println("1.Rút tiền");
            System.out.println("2.Truy vấn thông tin tài khoản");
            System.out.println("3.Thoát chương trình");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Drawmoney(scanner);
                    break;
                case 2:
                    checkMoney();
                    break;
                case 3:
                    System.out.println("Goodbye, see you later!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    private static void Drawmoney(Scanner scanner) {
        System.out.print("Nhập số tiền bạn muốn rút: ");
        float amount;
        amount = scanner.nextFloat();

        if (amount <= 0) {
            System.out.println("Lỗi: Số tiền phải lớn hơn 0.");
            return;
        }

        if (currentUser.getMoney() < amount) {
            System.out.println("Lỗi: Số tiền trong tài khoản không đủ.");
        } else {
            currentUser.setMoney(currentUser.getMoney() - amount);
            System.out.println("Rút tiền thành công. \nSố dư còn lại: " + currentUser.getMoney());
        }
    }

    private static void checkMoney() {
        System.out.printf("Số tiền trong tài khoản có Mã ID %s, của KH %s là: %.0f", currentUser.getId(), currentUser.getName(),  currentUser.getMoney());
    }
}
