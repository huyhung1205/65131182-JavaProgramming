package Lab2Bai4;
import Lab2Bai3.Lab2Bai3;
import Lab2Bai2.Lab2Bai2;
import Lab2Bai1.Lab2Bai1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Viết chương trình tổ chức 1 menu gồm 3 chức năng
// gọi 3 bài trên và một chức năng để thoát khỏi ứng dụng.

public class Lab2Bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option;
        while (true) {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất.");
        System.out.println("2. Giải phương trình bậc 2.");
        System.out.println("3. Tính tiền điện.");
        System.out.println("4. Kết thúc.");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chọn chức năng: ");
        option = s.nextInt();
            switch (option) {
                case 1:
                    Lab2Bai1.main(null);
                    break;
                case 2:
                    Lab2Bai2.main(null);
                    break;
                case 3:
                    Lab2Bai3.main(null);
                    break;
                case 4:
                    s.close();
                    return;
            }
        }
    }
}
