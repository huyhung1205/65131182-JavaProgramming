package Lab1;

import java.util.Scanner;

// Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật.
// Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật
public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Nhập chiều dài: ");
		double a = s.nextDouble();

		System.out.print("Nhập chiều rộng: ");
		double b = s.nextDouble();

		System.out.printf("Chu vi: %.2f\n", 2 * (a + b));
		System.out.printf("Diện tích: %.2f ", a * b);

		s.close();
	}
}
