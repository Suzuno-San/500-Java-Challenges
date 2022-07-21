package IfEles;

import java.util.Scanner;

//แปลงเงินในหน่วยดอลล่าสหรัฐ(จำนวนจริง) และตรวจสอบว่าถ้ามีค่ามากกว่า 0 ให้คำนวณในหน่วยบาท ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ "you don't have money"
public class Ex008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Dolar: ");
		double usd = sc.nextDouble();
		if(usd > 0) {
			double thb = (double)Math.round((usd*32.5)*100)/100;
			System.out.println(usd+" Dolar = "+thb+" Baht");
		}
		else {
			System.out.println("You don't have money");
		}
		sc.close();
	}
}
