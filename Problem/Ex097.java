package Problem;

import java.util.HashSet;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นจำนวนจริงโดยใช้ for loop จากนั้นให้พิมพ์อินพุตที่แตกต่างกันทั้งหมดออกมา
public class Ex097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Double> set1 = new HashSet<Double>();
		for(int i=1;i<=5;i++) {
			System.out.print("Input numeric: ");
			double num1 = sc.nextDouble();
			set1.add(num1);
		}
		System.out.println(set1);
		sc.close();
	}
}
