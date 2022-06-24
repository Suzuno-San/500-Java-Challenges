package OPP;

import java.util.ArrayList;
import java.util.Arrays;

/*เขียนโปรแกรมสร้าง class ชื่อ Cashier โดยมี attribute และ method ดังนี้
attribute
 * products เป็น array ที่เก็บชื่อสินค้า
method
 * recommend() ทำหน้าที่แนะนำสินค้า โดยเมื่อเรียกใช้ โปรแกรมจะพิมพ์ We have <product>. ออกมา*/
class Cashier {
	ArrayList<String> products;
	
	public Cashier(ArrayList<String> products) {
		this.products = products;
	}
	public void recommend() {
		System.out.print("We have ");
		for(int i=0;i<this.products.size();i++) {
			if(i==this.products.size()-1) {
				System.out.print(this.products.get(i)+".");
			}
			else {
				System.out.print(this.products.get(i)+", ");
			}
		}
	}
}

public class Ex010 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("apple","banana","orange"));
		Cashier cashier = new Cashier(a);
		cashier.recommend();
	}
}
