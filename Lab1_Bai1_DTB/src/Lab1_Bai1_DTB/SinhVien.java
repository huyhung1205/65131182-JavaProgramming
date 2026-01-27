package Lab1_Bai1_DTB;

import java.util.Scanner;

public class SinhVien {

//	Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím sau đó xuất ra màn hình.
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Nhập họ và tên sinh viên: ");
		String fullName = s.nextLine();

		System.out.print("Nhập điểm trung bình: ");
		double score = s.nextDouble();

		System.out.print(fullName + ": " + score + " điểm.");
		s.close();
	}

}
