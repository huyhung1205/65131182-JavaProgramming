package Lab1_Bai2_ChuviDT;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {

	// Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu
	// vi, diện tích và cạnh nhỏ của hình chữ nhật.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Nhập chiều dài: ");
		double a = s.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		double b = s.nextDouble();

		double c = 2 * (a + b);
		double d = a * b;
		double e = Math.min(a, b);

		System.out.println("Chu vi: " + c);
		System.out.println("Diện tích: " + d);
		System.out.println("Cạnh nhỏ: " + e);
		s.close();
	}
}
