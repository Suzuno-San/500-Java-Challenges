package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ จากนั้นให้พิมพ์อักขระที่ index เป็นเลขคี่
public class Ex021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				System.out.println(str.charAt(i));
			}
		}
		sc.close();
	}
}
