package Problem;

import java.util.ArrayList;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้หาค่าที่น้อยที่สุด, จำนวนครั้งที่ค่าน้อยสุดปรากฎ และพิมพ์ออกมา
public class Ex092 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> array1 = new ArrayList<Double>();
		double min = 0.0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric: ");
			double num1 = sc.nextDouble();
			array1.add(num1);
			if(i==1) {
				min = num1;
			}
			else {
				if(num1<min) {
					min = num1;
				}
			}
		}
		int countMin = 0;
		for(int i=0;i<array1.size();i++) {
			if(array1.get(i)==min) {
				countMin++;
			}
		}
		System.out.println("Min: "+min);
		System.out.println("CountMin: "+countMin);
		sc.close();
	}
}