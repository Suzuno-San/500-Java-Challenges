package Problem;

import java.util.Scanner;

//เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็มบวก หลักจากนั้นให้ตรวจสอบว่าจำนวนที่รับมาเป็นจำนวนเฉพาะหรือไม่
//*ถ้าเป็น ให้พิมพ์ "is prime"
//*ถ้าไม่เป็น ให้พิมพ์ "is not prime"
public class Ex016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Input Integer: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count > 2) {
			System.out.println("is not prime");
		}
		else {
			System.out.println("is prime");
		}
		sc.close();
	}
}
