
//Viết chương trình xuất ra màn hình bảng cửu chương

public class Bai2 {
    static void main(String[] args) {
        System.out.println("Bảng cửu chương");
        for (int i = 2; i <= 10; i++) {
            System.out.println("Bảng cửu chương " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
