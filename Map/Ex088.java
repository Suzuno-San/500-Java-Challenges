package Map;

import java.util.HashMap;

//กำหนดให้ map1 = {"first_name"="John","last_name"="Doe"} เขียนโปรแกรมเปลี่ยน value ของ key "first_name" เป็น "Jane" หลังจากนั้นให้พิมพ์ map1 ออกมา
public class Ex088 {
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("first_name","John");
		map1.put("last_name","Doe");
		map1.replace("first_name", "John", "Jane");
		System.out.println(map1);
	}
}
