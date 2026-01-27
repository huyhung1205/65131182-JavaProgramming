package Lab1;

import java.util.Scanner;

// Viết chương trình nhập từ bàn phím cạnh của một khối lập phương.
// Tính và xuất thể tích của khối chữ nhật
public class Lab1Bai3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương (đơn vị: cm):");
		double a = s.nextDouble();
		System.out.printf("Thể tích khối lập phương: %.2f(cm^3).", Math.pow(a, 3));
		s.close();
	}
}
