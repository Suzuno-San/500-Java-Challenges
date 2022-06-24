package OPP;

/*เขียนโปรแกรมสร้าง class ชื่อ Driver โดยมี attribute และ method ดังนี้
attribute
 * HP เป็นพลังชีวิต
 * generatedMoney เป็นเงินที่หาได้
method
 * drive() ทำหน้าที่แสดงค่าพลังชีวิต และเงินที่หามาได้หลังจากขับแท็กซี่โดยจะลด HP 10 หน่วย แต่จะเพิ่ม generatedMoney 10 หน่วย
 * care() ทำหน้าที่แสดงค่าพลังชีวิต และเงินที่หามาได้ หลังจากพักผ่อนโดยจะเพิ่ม HP 10 หน่วย แต่จะลด generatedMoney 10 หน่วย*/
class Driver {
	int HP, generatedMoney;
	
	public Driver(int HP, int generatedMoney) {
		this.HP = HP;
		this.generatedMoney = generatedMoney;
	}
	public void drive() {
		this.HP -= 10;
		this.generatedMoney += 10;
	}
	public void care() {
		this.HP += 10;
		this.generatedMoney -= 10;
	}
	public void report() {
		System.out.printf("HP = %d, Generated Money = %d\n", this.HP,this.generatedMoney);
	}
}

public class Ex014 {
	public static void main(String[] args) {
		Driver a = new Driver(100,100);
		a.drive();
		a.report();
		a.care();
		a.report();
	}
}
