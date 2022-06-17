package Problem;

import java.util.ArrayList;

//กำหนดให้ array2 = [1,2,3,...,25] เขียนโปรแกรมหาจำนวนเฉพาะใน array2 และพิมพ์ออกมา
public class Ex063 {
	public static void main(String[] args) {
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for(int i=1;i<=25;i++) {
			array2.add(i);
		}
		for(int i=0;i<array2.size();i++) {
			int count = 0;
			for(int j=1;j<=i+1;j++) {
				if(array2.get(i)%j==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(array2.get(i));
			}
		}
	}
}
