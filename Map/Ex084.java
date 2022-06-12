package Map;

import java.util.HashMap;

//กำหนดให้ map1 = {"first_name"="John","last_name"="Doe"} เขียนโปรแกรมพิมพ์ value ของ key "first_name" ออกมา
public class Ex084 {
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("first_name", "John");
		map1.put("last_name", "Doe");
		System.out.println(map1.get("first_name"));
	}
}
