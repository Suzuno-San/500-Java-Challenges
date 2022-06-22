package Function;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนฟังก์ชันสำหรับ shift สมาชิกใน array ไปทางขวา k step โดยรับ parameter 2 ตัว ได้แก่ arrayA ซึ่งเป็น array ที่เก็บข้อมูลใดๆ
และ k ซึ่งเป็นจำนวนครั้งที่ต้องการให้ shift ไปทางขวา ให้ return arrayA ที่ผ่านการ shift ออกมา*/
public class Ex026 {
	public static ArrayList<Integer> shift(ArrayList<Integer> arrayA, int k){
		ArrayList<Integer> shiftArray = new ArrayList<Integer>();
		k %= arrayA.size();
		for(int i=arrayA.size()-k;i<arrayA.size();i++) {
			shiftArray.add(arrayA.get(i));
		}
		for(int i=0;i<arrayA.size()-k;i++) {
			shiftArray.add(arrayA.get(i));
		}
		return shiftArray;
	}
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.print(shift(array1,2));
	}
}
