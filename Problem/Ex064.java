package Problem;

import java.util.ArrayList;

//กำหนดให้ array2 = [1,2,3,...,25] เขียนโปรแกรมหาค่าเฉลี่ยของจำนวนเฉพาะใน array2 และพิมพ์ออกมา
public class Ex064 {
	public static void main(String[] args) {
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for(int i=1;i<=25;i++) {
			array2.add(i);
		}
		int sum = 0;
		for(int i=0;i<array2.size();i++) {
			sum += array2.get(i);
		}
		System.out.println(sum/array2.size());
	}
}
