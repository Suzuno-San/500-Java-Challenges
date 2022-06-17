package Problem;

import java.util.Arrays;
import java.util.ArrayList;

//กำหนดให้ array1 = [1,2,3,...,10] เขียนโปรแกรมหาผลบวกกำลังสองของสมาชิกใน array1 ที่มี index เป็นเลขคี่ จากนั้นให้พิมพ์ผลลัพธ์ออกมา
public class Ex062 {
	public static void main(String[] args) {
		ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		int sum = 0;
		for(int i=0;i<array1.size();i++) {
			if(i%2!=0) {
				sum += array1.get(i)*array1.get(i);
			}
		}
		System.out.println(sum);
	}
}
