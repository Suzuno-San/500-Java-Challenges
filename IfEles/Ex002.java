package IfEles;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม และตรวจสอบว่าจำนวนที่รับมามีค่ามากกว่า 0 หรือไม่
public class Ex002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("greater than 0");
		}
		else {
			System.out.println("less than or equal to 0");
		}
		sc.close();
	}
}
