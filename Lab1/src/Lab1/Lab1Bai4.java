package Lab1;

import java.util.Scanner;

// Viết chương trình nhập các hệ số của phương trình bậc 2.
// Tính delta và xuất căn delta ra màn hình.
public class Lab1Bai4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Chương trình tính delta và xuất căn delta ra màn hình.");
		System.out.println("Phương trình bậc 2 có dạng: ax^2 + bx + c = 0");
		System.out.print("Nhập hệ số a: ");
		double a = s.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = s.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = s.nextDouble();

		if (a == 0)
			System.out.println("Đây không phải phương trình bậc 2!!!");
		else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			System.out.printf(
					"Căn delta có giá trị: " + (delta >= 0 ? Math.sqrt(delta) : "Không tồn tại vì delta = %.2f < 0"),
					delta);
		}

		s.close();
	}
}
