package IfEles;

import java.util.Scanner;

//รับอินพุต 1 ตัวเป็นอุณหภูมิฟาเรนไฮต์(จำนวนจริง) และตรวจสอบว่าถ้าค่ามากกว่าหรือเท่ากับ 32 ให้คำนวณในหน่วยองศาเซลเซียล ถ้ามีค่าน้อยกว่า 32 ให้พิมพ์ "cold"
public class Ex007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Fahrenheit: ");
		double f = sc.nextDouble();
		if(f >= 32) {
			double c = (double)Math.round(((5*(f-32))/9)*100)/100;
			System.out.println(f+" Fahrenfeit is "+c+" celsius");
		}
		else {
			System.out.println("cold");
		}
		sc.close();
	}
}
