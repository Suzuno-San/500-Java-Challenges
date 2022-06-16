package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*กำหนดให้ array4 = ['a','b','c','d','e','f'] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม(num1) จากนั้นให้ตรวจสอบว่า num1 มีค่าไม่เกิน index สุดท้ายของ array4 หรือไม่
-ถ้าไม่เกินให้ลบสมาชิกใน index ที่ num1 -ถ้าเกิน ไม่ดำเนินการใดๆ*/
public class Ex047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f'));
		System.out.print("Input Integer: ");
		int num1 = sc.nextInt();
		if(array4.size()>num1) {
			array4.remove(num1);
		}
		System.out.println(array4);
		sc.close();
	}
}
