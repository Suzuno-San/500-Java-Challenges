package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนเต็มโดยใช้ for loop จากนั้นให้หาผลรวมของจำนวนที่รับและพิมพ์ออกมา
public class Ex011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input Integer"+i+": ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}
}
