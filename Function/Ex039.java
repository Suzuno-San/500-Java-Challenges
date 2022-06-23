package Function;

import java.util.HashMap;
import java.util.ArrayList;

//เขียนฟังก์ชันเพื่อหา array ของ key และ value ของ map และ return ผลลัพธ์ทั้ง 2 ออกมา กำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ mapA ที่มีสมาชิกเป็นข้อมูลใดๆ
public class Ex039 {
	public static ArrayList<String> findKey(HashMap<String,String> mapA){
		ArrayList<String> key = new ArrayList<String>();
		for(HashMap.Entry<String,String> entry : mapA.entrySet()) {
			key.add(entry.getKey());
		}
		return key;
	}
	public static ArrayList<String> findValue(HashMap<String,String> mapA){
		ArrayList<String> value = new ArrayList<String>();
		for(HashMap.Entry<String,String> entry : mapA.entrySet()) {
			value.add(entry.getValue());
		}
		return value;
	}
	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("name", "John");
		map1.put("age", "32");
		System.out.println(findKey(map1));
		System.out.println(findValue(map1));
	}
}
