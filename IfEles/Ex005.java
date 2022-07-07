package IfEles;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 2 ตัวที่เป็นจำนวนเต็ม (width, length) และตรวจสอบว่าเป็นจำนวนเต็มบวกทั้งคู่ให้คำนวณพท.สี่เหลี่ยม ถ้าไม่ให้พิมพ์ "Please enter positive integer"
public class Ex005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Width: ");
		int width = sc.nextInt();
		System.out.print("Input Length: ");
		int length = sc.nextInt();
		if(width > 0 && length > 0) {
			System.out.println("Area of Square is "+width*length);
		}
		else {
			System.out.println("Please enter positive integer");
		}
		sc.close();
	}
}
