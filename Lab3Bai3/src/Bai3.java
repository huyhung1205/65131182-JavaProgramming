// Viết chương trình nhập mảng số nguyên từ bàn phím.
//Sắp xếp và xuất mảng vừa nhập ra màn hình.
//Xuất phần tử có giá trị nhỏ nhất ra màn hình
//Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Bai3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n;
        // Nhập số lượng phần tử
        while (true) {
            try {
                System.out.print("Nhập số lượng phần tử trong mảng: ");
                n = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Số lượng phần tử phải là số nguyên!");
                sc.next();
            }
        };
        // Nhập giá trị từng phần tử
        for (int i = 0; i<n; i++) {
            while (true) {
                try {
                    System.out.print("Nhập giá trị cho phần tử thứ " + i + ": ");
                    list.add(sc.nextInt());
                    break;
                } catch (Exception e) {
                    System.out.println("Vui lòng nhập số nguyên cho phần tử!!");
                    sc.next();
                }
            }
        }
        // Sắp xếp mảng và in ra màn hình
        Collections.sort(list);
        System.out.println("Mảng vừa săp xếp: " + list.toString());
        // Xuất phần tử có giá trị nhỏ nhất ra màn hình
        System.out.println("Phần tử có giá trị nhỏ nhất: " + list.get(0));
        // Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
        int avg = 0;
        int sum = 0;
        for(var i: list)
            if(i%3 == 0){
                sum += i;
                avg++;
            }
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + (float)sum/avg);
    }
}
