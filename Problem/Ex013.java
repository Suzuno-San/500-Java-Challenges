package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงใช้ for loop จากนั้นให้หาผลคูณของจำนวนที่เป็นบวกและพิมพ์ผลลัพธ์ออกมา
public class Ex013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int multiply = 1;
		for(int i=1;i<=5;i++) {
			System.out.print("Input Double"+i+": ");
			Double num = sc.nextDouble();
			multiply *= num;
		}
		System.out.println(multiply);
		sc.close();
	}
}
