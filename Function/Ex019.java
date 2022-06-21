package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*เขียนฟังก์ชันสำหรับทำงานในเครื่องแลกเหรียญอัตโนมัติ โดยรับ parameter 1 ตัว ได้แก่ amount ซึ่งเป็นจำนวนเต็มบวก ให้ return map ที่มี key เป็น 10,5,2,1 และ value
เป็นจำนวนเหรียญชนิดนั้นๆ โดยจะต้องแลกเหรียญที่มีค่ามากให้เสร็จก่อน*/
public class Ex019 {
	public static HashMap<Integer,Integer>exchangeCoin(int amount){
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(10,5,2,1));
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		for(int i: array1) {
			map1.put(i, amount/i);
			System.out.println(map1.get(i));
			amount = amount - map1.get(i)*i;
		}
		return map1;
	}
	public static void main(String[] args) {
		System.out.println(exchangeCoin(58));
	}
}
