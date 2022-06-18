package Problem;

import java.util.HashMap;
import java.util.Scanner;

/*กำหนดให้ map1 = {"apple"="52 kcal","banana"="132 kcal","carrot"="46 kcal"} เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระและให้ทำการตรวจสอบว่า
สายอักขระที่รับมาเป็นหนึ่งใน key ของ map1 หรือไม่
* ถ้าเป็นให้แทนที่ value ของ key นั้นเป็น "wait for new value"
* ถ้าไม่เป็น ให้สร้าง Key ใหม่ที่มีชื่อเดียวกับสายอักขระที่รับมา และกำหนด value เป็น "wait for assignment*/ 
public class Ex074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("apple", "52 kcal");
		map1.put("banana", "132 kcal");
		map1.put("carrot", "46 kcal");
		System.out.print("Input String: ");
		String str = sc.nextLine();
		if(map1.containsKey(str)) {
			map1.replace(str, map1.get(str), "wait for new value");
		}
		else {
			map1.put(str, "wait for assignment");
		}
		System.out.println(map1);
		sc.close();
	}
}
