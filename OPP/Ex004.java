package OPP;

/*
เขียนโปรแกรมสร้าง class ชื่อ Circle โดยมี attribute และ method ดังนี้
attribute
 * radius เป็นรัศมีของวงกลม
method
 * getArea() ทำหน้าที่แสดงค่าพื้นที่ของวงกลม(area = pi*radius^2)
 * getPerimeter() ทำหน้าที่แสดงค่าความยาวเส้นรอบวง (perimeter = 2*pi*radius)
*/
class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = Math.PI*(Math.pow(this.radius,2));
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
}
public class Ex004 {
	public static void main(String[] args) {
		Circle c1 = new Circle(32);
		Circle c2 = new Circle(16);
		System.out.println("Area Circle A : "+c1.getArea());
		System.out.println("Perimeter Circle A : "+c1.getPerimeter());
		System.out.println("Area Circle B : "+c2.getArea());
		System.out.println("Perimeter Circle B : "+c2.getPerimeter());
	}
}
