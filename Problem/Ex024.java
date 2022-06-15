package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 5 ตัวที่เป็นสายอักขระโดยใช้ for loop จากนั้นให้ตรวจสอบว่าในสายอักขระที่รับมาทั้งหมดมี 'a' ปรากฎกี่ครั้งและพิมพ์ออกมา
public class Ex024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i=1;i<=5;i++) {
			System.out.print("Input String: ");
			String str = sc.next();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='a') {
					count++;
				}
			}
		}
		System.out.println("'a' = "+count);
		sc.close();
	}
}
