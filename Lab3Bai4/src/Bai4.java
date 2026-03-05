import java.util.ArrayList;
import java.util.Scanner;

// Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
// Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực:
//    Yếu: điểm < 5
//    Trung bình: 5 <= điểm < 6.5
//    Khá: 6.5 <= điểm < 7.5
//    Giỏi: 7.5<= điểm < 9
//    Xuất sắc: điểm >= 9
// Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
public class Bai4 {
    public static void checkSl(int sl) throws Exception{
        if(sl < 0)
            throw new  Exception("");
    }
    public static void checkDiem(double diem) throws Exception{
        if(diem < 0 || diem > 10)
            throw new  Exception("");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<SinhVien> sinhVien = new ArrayList<>();
        int sl;
        // Nhập số lượng sinh viên
        while (true){
            try {
                System.out.print("Nhập số lượng sinh viên: ");
                sl = s.nextInt();
                checkSl(sl);
                break;
            } catch (Exception e){
                System.out.println("Số lượng là số nguyên và lớn hơn 0!!!");
                s.next();
            }
        }
        // Nhập từng sinh viên
        for (int i=0; i<sl; i++){
            System.out.println("Nhập thông tin sinh viên thứ " + (1+i));
            System.out.print("Nhập họ tên sinh viên: ");
            s.nextLine();
            String hoTen = s.nextLine();
            while (true) {
                try {
                    System.out.print("Nhập điểm sinh viên: ");
                    double diem = s.nextDouble();
                    checkDiem(diem);
                    SinhVien temp = new SinhVien(hoTen, diem);
                    sinhVien.add(temp);
                    break;
                } catch (Exception e) {
                    System.out.println("Điểm là số nguyên, lớn hơn bằng 0 và bé hơn bằng 10!!!");
                    s.next();
                }
            }
        }
        // Mảng đã nhập
        for (var sv: sinhVien)
            System.out.println(sv.toString());
        s.close();
    }
}
