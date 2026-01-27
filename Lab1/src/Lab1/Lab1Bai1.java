// Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím.
// Xuất ra màn hình với định dạng: <<họ và tên>><<điểm>>điểm.
package Lab1;

import java.util.Scanner;

public class Lab1Bai1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		String name = s.nextLine();

		System.out.print("Nhập điểm trung bình: ");
		double scrore = s.nextDouble();

		System.out.printf("%s %.2f điểm.", name, scrore);

		s.close();
	}
}
