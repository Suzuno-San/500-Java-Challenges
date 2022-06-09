package String;

import java.util.Arrays;
import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นสายอักขระ (sentence) ให้ทำการตัดคำในสายอักขระโดยใช้ " " เป็นตัวตัดคำ หลังจากนั้นให้พิมพ์ผลลัพธ์จากการตัดคำออกมา
//Ex: sentence = "We love Java" ให้ออกมาเป็น [We,love,Java]
public class Ex037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String sentence = sc.nextLine();
		System.out.print(Arrays.toString(sentence.split(" ")));
		sc.close();
	}
}
