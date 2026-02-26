package Lab2Bai1;

// Viết chương trình cho phép giải phương trình bậc nhất
// trong đó các hệ số a và b nhập từ bàn phím

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main() {
        System.out.println("Chương trình: Giải phương trình bậc nhất: ax + b = 0");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scan.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scan.nextDouble();

        if (a == 0) {
            if (b == 0)
                System.out.println("Phương trình có vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.print("Nghiệm của phương trình: " + (-b/a));
        }
        scan.close();
    }
}
