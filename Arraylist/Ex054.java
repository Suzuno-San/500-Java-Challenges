package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

//กำหนดให้ array3 = ["apple","cherry","eggfruit"] เขียนโปรแกรมเพื่อแทรก "banana" ไปเป็นสมาชิกใน index ที่ 1 ของ array3 หลังจากนั้นให้พิมพ์ array3 ออกมา
public class Ex054 {
	public static void main(String[] args) {
		ArrayList<String> array3 = new ArrayList<String>(Arrays.asList("apple","cherry","eggfruit"));
		array3.add(1, "banana");
		System.out.println(array3);
	}
}
