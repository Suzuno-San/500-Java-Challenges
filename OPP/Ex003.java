package OPP;

/*
เขียนโปรแกรมสร้าง class ชื่อ ComplexNumber โดยมี attribute และ method ดังนี้
attribute
 * r เป็นค่าของส่วนจริง
 * i เป็นค่าของส่วนจินตภาพ
method
 * getValue() ทำหน้าที่แสดงค่า cartesian form เช่น 2+3i, 5-4i เป็นต้น โดยเมื่อเรียกใช้ getValue() โปรแกรมจะพิมพ์ <r>+<i>i
 */

class ComplexNumber {
	int r;
	int i;
	
	public ComplexNumber(int r,int i) {
		this.r = r;
		this.i = i;
	}
	public void getValue(){
		System.out.println(this.r+"+"+this.i+"i");
	}
	
}
public class Ex003 {
	public static void main(String[] args) {
		ComplexNumber z = new ComplexNumber(2,4);
		z.getValue();
	}
}
