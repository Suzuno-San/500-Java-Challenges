package Problem;

import java.util.HashSet;
import java.util.Scanner;

//สร้าง empty set แล้วเขียนโปรแกรมรับอินพุตที่เป็นจำนวนเต็ม จากนั้นให้ทำการ add จำนวนที่รับลงใน set จนกว่า set จะมีสมาชิก 5 ตัว จากนั้นให้พิมพ์ค่า set ที่สร้างออกมา
public class Ex082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set1 = new HashSet<Integer>();
		while(set1.size()!=5) {
			System.out.print("Input Integer: ");
			int int1 = sc.nextInt();
			set1.add(int1);
			System.out.println(set1);
		}
		sc.close();
	}
}
