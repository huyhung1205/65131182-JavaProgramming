package Lab2Bai2;

// Viết chương trình cho phép giải phương trình bậc hai
// trong đó các hệ số a, b và c nhập từ bàn phím

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main() {
        System.out.println("Chương trình: Giải phương trình bậc 2 có dạng: ax^2 + bx + c = 0");
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = s.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = s.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = s.nextDouble();

        if(a == 0){
            if (b == 0) {
                if (c == 0)
                    System.out.println("Phương trình có vô số nghiệm");
                else
                    System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.print("Nghiệm của phương trình: " + (-c/b));
            }
        } else {
            double delta = (b * b) - (4 * a * c);
            if(delta < 0)
                System.out.println("Phương trình vô nghiệm");
            else if(delta == 0)
                System.out.println("Phương trình có nghiệm kép: x = " + -b/(2*a));
            else
                System.out.println("Phương trình có 2 nghiệm phân biệt:\nx1 = " + (-b + Math.sqrt(delta))/(2*a) + "\nx2 = " + (-b - Math.sqrt(delta))/(2*a));
        }
        s.close();
    }
}
