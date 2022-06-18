package Problem;

import java.util.HashMap;
import java.util.Scanner;

/*กำหนดให้ map1 = {"apple"="52 kcal","banana"="132 kcal","carrot"="46 kcal"} เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระและให้ตรวจสอบว่า
สายอักขระที่รับมาเป็นหนึ่งใน key ของ map1 หรือไม่
* ถ้าเป็น ให้พิมพ์ value ของ key นั้นออกมา
* ถ้าไม่เป็น ให้สร้าง key ใหม่ที่มีชื่อเดียวกับสายอักขระที่รับมา และกำหนด value เป็น "wait for assignment" จากนั้นให้พิมพ์ค่า map1 ออกมา*/ 
public class Ex073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("apple", "52 kcal");
		map1.put("banana", "132 kcal");
		map1.put("carrot", "46 kcal");
		System.out.print("Input String: ");
		String str1 = sc.nextLine();
		if(map1.containsKey(str1)) {
			System.out.println(map1.get(str1));
		}
		else {
			map1.put(str1, "wait for assignment");
			System.out.println(map1);
		}
		sc.close();
	}
}
