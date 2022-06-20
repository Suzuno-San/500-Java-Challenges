package Problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*ให้ set1 = ["1","2","3","a","b","c"] เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระและให้ทำการตรวจสอบว่า สายอักขระที่รับมาเป็นหนึ่งในสมาชิกของ set1 หรือไม่
* ถ้าเป็น ให้ทำการลบสมาชิกตัวนั้น
* ถ้าไม่เป็น ไม่ดำเนินการใดๆ*/
public class Ex083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set1 = new HashSet<String>(Arrays.asList("1","2","3","a","b","c"));
		System.out.print("Input String: ");
		String str1 = sc.next();
		if(set1.contains(str1)) {
			set1.remove(str1);
		}
		System.out.println(set1);
		sc.close();
	}
}
