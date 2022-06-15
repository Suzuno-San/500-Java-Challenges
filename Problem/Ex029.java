package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 2 ตัวที่เป็นสายอักขระและจำนวนเต็มตามลำดับ(str1,int1) ถ้าความยาวของ str1 น้อยกว่า int1 
//ให้ทำการต่อ str1 ด้วย "*" จนกว่าความยาวของ str1 จะไม่น้อยกว่า int1 สุดท้ายให้พิมพ์ค่า str1 ที่ผ่านกระบวนการดังกล่าวออกมา
public class Ex029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str1 = sc.next();
		System.out.print("Input Integer: ");
		int int1 = sc.nextInt();
		while(str1.length() < int1) {
			str1 += "*";
		}
		System.out.println(str1);
		sc.close();
	}
}
