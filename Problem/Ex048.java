package Problem;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/*กำหนดให้ array4 = ['a','b','c','d','e','f'] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ(str1) จากนั้นให้ตรวจสอบว่า str1 เป็นสมาชิกของ array4 หรือไม่
-ถ้าเป็นให้ทำการลบ str1 ออกจาก array4 -ถ้าไม่เป็น ไม่ดำเนินการใดๆ*/
public class Ex048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array4 = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
		System.out.print("Input Character: ");
		String str1 = sc.next();
		if(array4.contains(str1)) {
			array4.remove(str1);
		}
		System.out.println(array4);
		sc.close();
	}
}
