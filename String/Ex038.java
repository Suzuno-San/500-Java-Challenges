package String;

import java.util.Scanner;
import java.util.Arrays;

//เขียนโปรแกรมรัยอินพุต 2 ตัวที่เป็นสายอักขระ (sentence, c) ให้ทำการตัดคำใน sentence โดยใช้ c เป็นตัวตัดคำ หลังจากนั้นให้พิมพ์ผลลัพธ์จากการตัดคำออกมา
//Ex: sentence = "Thai-land", c = "-" ผลลัพธ์คือ [Thai,land]
public class Ex038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Input c: ");
		String c = sc.next();
		System.out.println(Arrays.toString(sentence.split(c)));
		sc.close();
	}
}
