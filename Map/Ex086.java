package Map;

import java.util.HashMap;

//กำหนดให้ map1 = {"first_name"="John","last_name"="Doe"} เขียนโปรแกรมพิมพ์ list ของ key ทั้งหมดออกมา
public class Ex086 {
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("first_name","John");
		map1.put("last_name","Doe");
		System.out.println(map1.keySet());
	}
}
