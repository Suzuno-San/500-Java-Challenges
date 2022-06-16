package Problem;

import java.util.Arrays;
import java.util.ArrayList;

//กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมพิมพ์สมาชิกใน array1 ที่หารด้วย 3 ลงตัว
public class Ex039 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		for(int i=0;i<array1.size();i++) {
			if(array1.get(i)%3==0) {
				System.out.println(array1.get(i));
			}
		}
	}
}
