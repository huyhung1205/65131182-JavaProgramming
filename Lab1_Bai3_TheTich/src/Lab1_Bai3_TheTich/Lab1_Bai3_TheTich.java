package Lab1_Bai3_TheTich;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {

//	Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất thể tích của khối chữ nhật
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nhập cạnh khối lập phương: ");
		double a = scan.nextDouble();
		System.out.println("Thể tích khối chữ nhật: " + 2 * Math.pow(a, 3));

		scan.close();
	}
}
