package Problem;

import java.util.Scanner;
import java.util.HashSet;

//สร้าง empty set แล้วเขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนเต็มโดยใช้ for loop จากนั้นให้ทำการ add จำนวนที่รับลงใน set สุดท้ายให้พิมพ์ค่า set ที่สร้างและจำนวนสมาชิกใน set ออกมา
public class Ex081 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=1;i<=5;i++) {
			System.out.print("Input Integer: ");
			int int1 = sc.nextInt();
			set1.add(int1);
		}
		System.out.println(set1);
		System.out.println(set1.size());
		sc.close();
	}
}
