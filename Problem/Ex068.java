package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*กำหนดให้ array1 = [1,2,3,4] และ array2 = ["ant","bird","cat","dog"] เขียนโปรแกรมสร้าง map ที่มี key เป็นสมาชิกใน array1 และ มี
value เป็นสมาชิกใน array2 ที่ index ตรงกัน จากนั้นให้พิมพ์ค่า map ที่สร้างออกมา*/
public class Ex068 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("ant","brid","cat","dog"));
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		for(int i=0;i<array1.size();i++) {
			map1.put(array1.get(i), array2.get(i));
		}
		System.out.println(map1);
	}
}
