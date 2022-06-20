package Problem;

import java.util.HashMap;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้ทำการหาฐานนิยมและพิมพ์ออกมา
public class Ex099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Double,Integer> map1 = new HashMap<Double,Integer>();
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric: ");
			Double num1 = sc.nextDouble();
			if(map1.containsKey(num1)) {
				map1.put(num1,map1.get(num1)+1);
			}
			else {
				map1.put(num1, 1);
			}
		}
		double mode = 0;
		int freq = 0;
		for(HashMap.Entry<Double,Integer> entry : map1.entrySet()) {
			if(entry.getValue()>freq) {
				mode = entry.getKey();
				freq = entry.getValue();
			}
		}
		System.out.println(mode);
		sc.close();
	}
}
