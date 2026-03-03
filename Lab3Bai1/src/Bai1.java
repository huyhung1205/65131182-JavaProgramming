// Viết chương trình nhập một số nguyên từ bàn phím
// cho biết số đó có phải là số nguyên tố hay không
// (số nguyên tố là số chỉ chia hết cho 1 và chính nó).

import java.util.Scanner;

public class Bai1 {
    static void main(String[] args) {
        boolean state = true;
        int a;
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập số nguyên: ");
                a = s.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số nguyên!!!");
                s.nextLine();
            }
        }

        for (int i =2; i < a - 1; i++){
            if(a % i == 0){
                state = false;
                break;
            }
        }

        if (state)
            System.out.println(a + " là số nguyên tố");
        else
            System.out.println(a + " không phải là số nguyên tố");

    }
}
