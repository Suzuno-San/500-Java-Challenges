package IfEles;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนจริง และตรวจสอบว่าจำนวนที่รับมามีค่ามากกว่า 0, น้อยกว่า 0 หรือเท่ากับ 0
public class Ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("positive");
		}
		else if(num < 0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
		sc.close();
	}
}
