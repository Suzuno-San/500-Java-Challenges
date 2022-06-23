package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*เขียนฟังก์ชันสำหรับหา derivatives ของพหุนาม โดยรับ parameter 1 ตัว คือ arrayA ซึ่งเป็น array ที่เก็บสัมประสิทธิ์หน้าพจของพหุนาม 
โดยที่ index ของ arrayA จะบ่งบอกพจน์ของเลขชี้กำลังให้ return array ที่มีความยาวเท่ากับ arrayA ที่เก็บสัมประสิทธิ์จาก derivatives ของพหุนามที่รับมา*/
public class Ex044 {
	static ArrayList<Integer> derivative(ArrayList<Integer> arrayA){
		ArrayList<Integer> diff = new ArrayList<Integer>(Collections.nCopies(arrayA.size(), 0));
		for(int i=1;i<arrayA.size();i++) {
			diff.set(i-1, arrayA.get(i)*i);
		}
		return diff;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(2,3,0,1));
		System.out.println(derivative(array1));
	}
}
