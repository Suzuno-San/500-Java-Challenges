package Problem;

import java.util.Scanner;
import java.util.HashMap;

/*กำหนดให้ map2 = {"name"="Mario","age"="30","job"="mushroom picker"} เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระและทำการตรวจสอบว่า
สายอักขระที่รับมาเป็นหนึ่งใน value ของ map2 หรือไม่
* ถ้าเป็น ให้พิมพ์ "yes"
* ถ้าไม่เป็น ให้พิมพ์ "no"*/
public class Ex075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("name", "Mario");
		map2.put("age", "30");
		map2.put("job", "mushroom picker");
		System.out.print("Input CheckValue: ");
		String str1 = sc.nextLine();
		if(map2.containsValue(str1)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		sc.close();
	}
}
