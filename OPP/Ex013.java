package OPP;

/*เขียนโปรแกรมสร้าง class ชื่อ Businessman โดยมี attribute และ method ดังนี้
attribute
 * HP เป็นพลังชีวิต
 * money เป็นพลังการเงิน
 * happiness เป็นพลังความสุข
method
 * work() ทำหน้าที่แสดงค่าพลังชีวิต การเงิน และความสุข หลังจากผ่านการทำงาน โดยจะเพิ่ม money 20 หน่วย และ happiness 10 หน่วย แต่จะลด HP 10 หน่วย
 * sleep() ทำหน้าที่แสดงค่าพลังชีวิต การเงิน และความสุข หลังจากผ่าน การนอนหลับ โดยจะเพิ่ม HP 20 หน่วย และ happiness 10 หน่วย แต่จะลด money 10 หน่วย
 * play() ทำหน้าที่แสดงค่าพลังชีวิต การเงิน และความสุข หลังจากผ่านการเล่นเกม โดยจะลด HP และ money 10 หน่วย แต่จะเพิ่ม happiness 20 หน่วย*/
class Businessman {
	int HP,money,happiness;
	
	public Businessman(int HP, int money, int happiness) {
		this.HP = HP;
		this.money = money;
		this.happiness = happiness;
	}
	public void work() {
		this.HP -= 10;
		this.money += 20;
		this.happiness += 10;
	}
	public void sleep() {
		this.HP += 20;
		this.money -= 10;
		this.happiness += 10;
	}
	public void play() {
		this.HP -= 10;
		this.money -= 10;
		this.happiness += 20;
	}
	public void report() {
		System.out.printf("HP = %d, Money = %d, Happiness = %d\n",this.HP,this.money,this.happiness);
	}
}
public class Ex013 {
	public static void main(String[] args) {
		Businessman John = new Businessman(100,100,100);
		John.report();
		John.work();
		John.report();
		John.play();
		John.report();
		John.sleep();
		John.report();
	}
}
