package IfEles;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวเป็นจำนวนเต็ม และตรวจสอบว่าจำนวนที่รับมามีค่าน้อยกว่า 0, มากกว่า 0, หรือเท่ากับ 0 และให้ตรวจสอบว่าเป็นจำนวนคู่ หรือ คี่ หรือ 0
public class Ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = sc.nextInt();
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("positive even");
			}
			else {
				System.out.println("positive odd");
			}
		}
		else if(num < 0) {
			if(num%2 == 0) {
				System.out.println("negetive even");
			}
			else {
				System.out.println("negetive odd");
			}
		}
		else {
			System.out.println("zero");
		}
		sc.close();
	}
}
