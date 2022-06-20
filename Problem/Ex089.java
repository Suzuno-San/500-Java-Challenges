package Problem;

import java.util.ArrayList;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้หาค่าที่มากที่สุด, จำนวนครั้งที่ที่ค่ามากสุดปรากฎ และพิมพ์ออกมา
public class Ex089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> array1 = new ArrayList<Double>();
		double max = 0.0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric"+i+": ");
			double num1 = sc.nextDouble();
			array1.add(num1);
			if(i==1) {
				max = num1;
			}
			else {
				if(num1>max) {
					max = num1;
				}
			}
		}
		int countMax = 0;
		for(int i=0;i<array1.size();i++) {
			if(array1.get(i)==max) {
				countMax++;
			}
		}
		System.out.println(max);
		System.out.println(countMax);
		sc.close();
	}
}
