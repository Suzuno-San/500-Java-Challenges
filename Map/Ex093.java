package Map;

import java.util.HashMap;

//กำหนดให้ map1 = {"first_name"="John","last_name"="Doe","age"="32"} เขียนโปรแกรมลบข้อมูลทั้งหมดออกจาก map1 หลังจากนั้นให้พิมพ์ map1 ออกมา
public class Ex093 {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String,String>();
		map1.put("first_name", "John");
		map1.put("last_name", "Doe");
		map1.put("age", "32");
		map1.clear();
		System.out.println(map1);
	}
}
