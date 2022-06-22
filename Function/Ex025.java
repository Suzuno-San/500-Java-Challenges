package Function;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนฟังก์ชันเพื่อหาระยะห่างระหว่างจุด 2 จุดในระนาบ n มิติ และ return ผลลัพธ์ออกมา(hint: euclidean distance)
กำหนดให้ฟังก์ชันนี้รับ parameter 2 ตัว คือ p1 และ p2 ที่เป็น array ความยาว n*/
public class Ex025 {
	public static double distance(ArrayList<Double> p1, ArrayList<Double> p2) {
		double sumsqrt = 0;
		for(int i=0;i<p1.size();i++) {
			sumsqrt += Math.pow(p1.get(i)-p2.get(i), 2);
		}
		double result = Math.sqrt(sumsqrt);
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.0,2.0,2.0,1.0));
		ArrayList<Double> b = new ArrayList<Double>(Arrays.asList(3.0,4.0,0.0,-1.0));
		System.out.println(distance(a,b));
	}
}
