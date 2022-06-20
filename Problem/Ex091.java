package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยยใช้ for loop จากนั้นให้หาค่าที่น้อยที่สุด
public class Ex091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = 0.0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric"+i+": ");
			double num1 = sc.nextDouble();
			if(i==1) {
				min = num1;
			}
			else {
				if(num1 < min) {
					min = num1;
				}
			}
		}
		System.out.print("min : "+min);
		sc.close();
	}
}
