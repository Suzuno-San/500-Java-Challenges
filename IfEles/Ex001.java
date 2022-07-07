package IfEles;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม และตรวจว่าจำนวนที่รับมาเป็นเลขคู่หรือเลขคี่
public class Ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number: ");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		sc.close();
	}
}