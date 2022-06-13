package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้หาผลรวมของจำนวนที่เป็นบวกและจำนวนที่เป็นลบ สุดท้ายให้พิมพ์ผลลัพธ์ออกมา
public class Ex012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input Double"+i+": ");
			double num = sc.nextDouble();
			sum += num;
		}
		System.out.println(sum);
		sc.close();
	}
}
