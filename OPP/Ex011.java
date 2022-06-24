package OPP;

/*เขียนโปรแกรมสร้าง class ชื่อ Warrior โดยมี attribute และ method ดังนี้
attribute
 * power เป็นพลังโจมตี
 * defense เป็นพลังป้องกัน
 * HP เป็นพลังชีวิต
method
 * attack(warrior_object) ทำหน้าที่แสดงค่าพลังชีวิตหลังจากถูกโจมตีโดยที่
 	- ถ้า power <= defense แลัว HP จะมีค่าเท่ากับ HP-(power-defense)
 	- ถ้า power > defense แล้ว HP จะมีค่าเท่ากับ HP-(power-defense)
โดยเมื่อเรียกใช้ โปรแกรมจะแสดงค่า HP ออกมา และถ้า HP = 0 ให้พิมพ์ Enemy died ออกมา*/
class Warrior {
	int power;
	int defense;
	int HP;
	
	public Warrior(int power, int defense, int HP) {
		this.power = power;
		this.defense = defense;
		this.HP = HP;
	}
	public void attack(Warrior enemy) {
		if(enemy.HP > 0 && this.HP > 0) {
			enemy.HP = Math.max(0, enemy.HP-Math.max(0, this.power-enemy.defense));
		}
		if(enemy.HP==0) {
			System.out.println("Enemy died");
		}
	}
}
public class Ex011 {
	public static void main(String[] args) {
		Warrior WarriorA = new Warrior(100, 50, 80);
        Warrior WarriorB = new Warrior(60, 80, 120);
        System.out.println("=== Before Attack ===");
        System.out.println("Warrior A HP = " + WarriorA.HP);
        System.out.println("Warrior B HP = " + WarriorB.HP);
        WarriorA.attack(WarriorB);
        WarriorB.attack(WarriorA);
        System.out.println("=== After Attack ===");
        System.out.println("Warrior A HP = " + WarriorA.HP);
        System.out.println("Warrior B HP = " + WarriorB.HP);
	}
}
