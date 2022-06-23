package OPP;

/*เขียนโปรแกรมสร้าง class ชื่อ Car โดยมี attribute และ method ดังนี้ attribute และ method ดังนี้
attribute
 * brand เป็นยี่ห้อของรถ
 * Model เป็นรุ่นของรถ
 * year เป็นปีของรถ
 * color เป็นสีของรถ
 method
 * newColor(color) รับพารามิเตอร์ 1 ตัว ชื่อว่า color ทำหน้าที่แสดงสีใหม่ของรถที่ต้องการเปลี่ยน*/
class Car {
	String brand;
	String Model;
	String year;
	String color;
	
	public Car(String brand, String Model, String year, String color) {
		this.brand = brand;
		this.Model = Model;
		this.year = year;
		this.color = color;
	}
	public void NewColor(String color) {
		this.color = color;
	}
}
public class Ex006 {
	public static void main(String[] args) {
		Car c1 = new Car("Honda","Civic","2019","Black");
		c1.NewColor("Red");
		System.out.println("color = "+c1.color);
	}
	
}
