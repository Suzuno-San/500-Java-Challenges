package Problem;

import java.util.ArrayList;
import java.util.Scanner;

/*เขียนโปรแกรมสร้าง empty array และรับอินพุตที่เป็นสายอักขระและ add เข้าไปใน array จนกว่าความยาวของ array จะเท่ากับ 5 โดยมีเงื่อนไขว่า
ถ้าสายอักขระที่รับเป็นสมาชิกใน array อยู่แล้วจะไม่ทำการ add*/
public class Ex035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		while(array1.size()<5) {
			System.out.print("Input Integer: ");
			int int1 = sc.nextInt();
			if(!array1.contains(int1)) {
				array1.add(int1);
			}
		}
		System.out.println(array1);
		sc.close();
	}
}
