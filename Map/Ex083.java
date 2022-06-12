package Map;

import java.util.HashMap;

//เขียนโปรแกรมสร้าง map ที่มี key เป็น "first_name" และ "last_name" โดยมี vaulue เป็น "John" และ "Doe" ตามลำดับ จากนั้นให้ทำการพิมพ์ค่าของ map ที่สร้างออกมา
public class Ex083 {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String,String>();
		map1.put("first_name", "John");
		map1.put("last_name", "Doe");
		System.out.println(map1);
	}
}
