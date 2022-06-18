package Problem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/*เขียนโปรแกรมรับอินพุต 1 ตัวที่เป็นจำนวนเต็ม(n) จากนั้นให้ผู้ใช้งานกรอกข้อมูลเพื่อสร้าง array1 ความยาว n ที่มีสมาชิกเป็นจำนวนจริง จากนั้นหาค่าเฉลี่ยและความแปรปรวนของข้อมูลใน array1
และความแปรปรวนของข้อมูลใน array1 และเก็บไว้ใน map ที่มี key ชื่อ"mean"และ"variance" จากนั้นให้พิมพ์ค่า map ที่สร้างออกมา*/
public class Ex072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> array1 = new ArrayList<Double>();
		System.out.print("Input n : ");
		int n = sc.nextInt();
		double sum = 0;
		for(int i=0;i<n;i++) {
			System.out.print("Input numeric: ");
			double num = sc.nextDouble();
			array1.add(num);
			sum += num;
		}
		double mean = sum/n;
		double var1 = 0;
		for(int i=0;i<n;i++) {
			var1 = var1+(array1.get(i)-mean)*(array1.get(i)-mean);
		}
		var1 /= n;
		HashMap<String,Double> map1 = new HashMap<String, Double>();
		map1.put("mean", mean);
		map1.put("variance", var1);
		System.out.println(map1);
		sc.close();
	}
}
