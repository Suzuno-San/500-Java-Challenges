package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้หาค่าที่มากที่สุดและพิมพ์ออกมา
public class Ex088 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = 0.0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric"+i+": ");
			double num1 = sc.nextDouble();
			if(i==1) {
				max = num1;
			}
			else {
				if(num1>max) {
					max = num1;
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
}
