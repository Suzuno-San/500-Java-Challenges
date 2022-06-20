package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*กำหนดให้ country = ["brazil","China","Germany","Japan","Sweden"] เขียนโปรแกรมเพื่อเก็บยอดขายสินค้า(จำนวนจริง) ลงใน map โดยกำหนดให้ key 
เป็นสมาชิกใน country และ value เป็นยอดขายสินค้าของประเทศนั้นๆ หลังจากทำกการเก็บข้อมูลเรียบร้อย ให้พิมพ์ยอดขายสูงสุดและประเทศที่ทำให้ยอดขายได้สูงสุดออกมา*/ 
public class Ex090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> country = new ArrayList<String>(Arrays.asList("brazil","China","Germany","Japan","Sweden"));
		HashMap<String,Double> map1 = new HashMap<String,Double>();
		Double max = 0.0;
		for(int i=0;i<country.size();i++) {
			System.out.print(country.get(i)+" income : ");
			Double income = sc.nextDouble();
			map1.put(country.get(i), income);
			if(i==0) {
				max = income;
			}
			else {
				if(income > max) {
					max = income;
				}
			}
		}
		System.out.println("max income: "+max);
		for(HashMap.Entry<String,Double> entry : map1.entrySet()) {
			if(max==entry.getValue()) {
				System.out.println("highest income country: "+entry.getKey());
			}
		}
		sc.close();
		
	}
}
