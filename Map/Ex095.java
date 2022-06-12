package Map;

import java.util.HashMap;
import java.util.Scanner;

//กำหนดให้ map1 = {"first_name"="John","last_name"="Doe","age"="32"} เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ(str1) ให้ทำการตรวจสอบว่า str1 เป็นหนึ่งใน key ของ map1 หรือไม่ จากนั้นให้พิมพ์ค่าความจริงออกมา
public class Ex095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map1 = new HashMap<String,String>();
		map1.put("first_name", "John");
		map1.put("last_name", "Doe");
		map1.put("age", "32");
		System.out.print("Input String: ");
		String str1 = sc.next();
		System.out.println(map1.containsKey(str1));
		sc.close();
	}
}
