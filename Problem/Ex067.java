package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*กำหนดให้ array1 = ["one","two","three","four"] และ array2 = [1,2,3,4] เขียนโปรแกรมสร้าง map ที่มี key เป็นสมาชิกใน array1 และมี value เป็นสมาชิกใน array2 ที่
index ตรงกัน จากนั้นให้พิมพ์ค่า map ที่สร้างออกมา*/
public class Ex067 {
	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("one","two","three","four"));
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		for(int i=0;i<array1.size();i++) {
			map1.put(array1.get(i),array2.get(i));
		}
		System.out.println(map1);
	}
}
