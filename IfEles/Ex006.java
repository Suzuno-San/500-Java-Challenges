package IfEles;

import java.util.Scanner;

/*รับอินพุต 1 ตัวเป็นปีคริสตศักราช(จำนวนเต็ม) และตรวจสอบว่า ถ้าจำนวนที่รับมีค่ามากกว่าหรือเท่ากับ 0 ให้คำนวณปีพุทธศักราช(ปีคริสศักราช + 543) ถ้าค่าน้อยกว่า 0 ให้พิมพ์ 
"Please enter a number that is greater than or equal to 0"*/
public class Ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Year(AD): ");
		int ad = sc.nextInt();
		if(ad >= 0) {
			int be = ad + 543;
			System.out.println(ad+"AD = "+be+"BE");
		}
		else {
			System.out.println("Please enter a number taht is greater that or equal to 0");
		}
		sc.close();
	}
}
