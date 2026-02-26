package Lab2Bai3;

//Viết chương trình nhập vào số điện sử dụng của tháng
// tính tiền điện theo phương pháp lũy tiến:
// Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
// Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200

import java.util.Scanner;

public class Lab2Bai3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tiền điện theo phương pháp lũy tiến:");
        System.out.print("Nhập số điện sử dụng (kWh): ");
        int k = scanner.nextInt();
        double tien = 0;
        if(k <= 50){
            tien = k*1000;
        } else {
            tien = 50*1000 + (k-50)*1200;
        }
        System.out.printf("Tiền điện phải trả là: %.0f VNĐ",tien);
    }
}
