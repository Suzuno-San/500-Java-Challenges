package Function;

import java.util.ArrayList;
import java.util.Arrays;

//เขียนฟังก์ชันเพื่อหาผลบวกสะสมไล่ตาม index และ return ผลลัพธ์ออกมากำหนดให้ฟังก์ชันนี้รับ parameter 1 ตัว คือ arrayA ที่มีสมาชิกเป็นจำนวนเต็ม
public class Ex040 {
	static ArrayList<Integer> sumIndex(ArrayList<Integer> arrayA){
		ArrayList<Integer> sumindex = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0;i<arrayA.size();i++) {
			sum += arrayA.get(i);
			sumindex.add(sum);
		}
		return sumindex;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(sumIndex(array1));
	}
}
