package Function;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนฟังก์ชันเพื่อค้นหาตำแหน่งใน array โดยรับ parameter 2 ตัว ได้แก่ arrayA ซึ่งเป็น array ที่เก็บข้อมูลใดๆ (ไม่มีข้อมูลซ้ำ) และ
k ซื่งเป็นข้อมูลที่ต้องการค้นหา ให้ return ตำแหน่งของ arrayA ที่มี k ปรากฎ ถ้าไม่มี k ปรากฎ ให้ return array ที่มีสมาชิกเป็น -1*/
public class Ex018 {
	public static ArrayList<Integer> indexArray(ArrayList<String> arrayA ,String k){
		ArrayList<Integer> findIndex = new ArrayList<Integer>();
		if(arrayA.contains(k)) {
			for(int i=0;i<arrayA.size();i++) {
				if(arrayA.get(i)==k) {
					findIndex.add(i);
				}
			}
		}
		else {
			findIndex.add(-1);
		}
		return findIndex;
	}
	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		System.out.println(indexArray(array1,"b"));
	}
}
