package OPP;

/*เขียนโปรแกรมสร้าง class ชื่อ Dog โดยมี attribute และ method ดังนี้
attribute
 * breed เป็นพันธุ์สุนัข
 * color เป็นสีของสุนัข
 * height เป็นส่วนสูง(หน่วยเซนติเมตร)
 * weight เป็นน้ำหนัก(หน่วยกิโลกรัม)
method
 * growth() ทำหน้าที่แสดงความสูงและน้ำหนักที่เพิ่มขึ้นของสุนัขอย่างละ 10%*/
class Dog {
	String breed;
	String color;
	int height;
	double weight;
	
	public Dog(String breed, String color, int height, double weight) {
		this.breed = breed;
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
	public void growth() {
		this.height += (this.height/100)*10; //or this.height * 1.1
		this.weight += (this.weight/100)*10; //or this.weigth * 1.1
	}
}

public class Ex007 {
	public static void main(String[] args) {
		Dog d1 = new Dog("Jack Russell Terrier","White",30,7);
		d1.growth();
		System.out.println("height = "+d1.height);
		System.out.println("weight = "+d1.weight);
	}
}
