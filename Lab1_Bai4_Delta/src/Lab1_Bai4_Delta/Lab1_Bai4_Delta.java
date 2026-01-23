package Lab1_Bai4_Delta;

import java.util.Scanner;

public class Lab1_Bai4_Delta {

//	Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		Phương trình bậc 2 có dạng; ax^2 + bx + c = 0
		System.out.println("Nhập các hệ số của phươn trình bậc 2: ");
		System.out.print("Nhập a: ");
		double a = scan.nextDouble();
		System.out.print("Nhập b: ");
		double b = scan.nextDouble();
		System.out.print("Nhập c: ");
		double c = scan.nextDouble();

		System.out.printf("Căn delta = %.3f", Math.sqrt((Math.pow(b, 2) - 4 * a * c)));

		scan.close();
	}

}
