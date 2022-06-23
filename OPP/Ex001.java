package OPP;

/*
เขียนโปรแกรมสร้าง class ชื่อ People โดยมี attribute และ method ดังนี้
attribute
 * name เป็นชื่อบุคคล
 * age เป็นอายุของบุคคล
method
 * introduce() เมื่อเรียกใช้จะพิมพ์ข้อความ My name is <name>. I'm <age> years old
*/
class People{
	String name;
	int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void introduce() {
		System.out.print("My name is"+this.name+". ");
		System.out.print("I'm "+this.age+" years old.");
	}
}

public class Ex001 {
	public static void main(String[] args) {
		People John = new People("John",23);
		John.introduce();
	}
}
