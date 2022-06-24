package OPP;

/*เขียนโปรแกรมสร้าง class Point โดยมี attribute และ method ดังนี้
attribute
 * x เป็นค่าตามแกน x ในระนาบ 2 มิติ
 * y เป็ฯค่าตามแกน y ในระนาบ 2 มิติ
method
 * moveUP(d) รับ parameter 1 ตัว คือ d
 	- เลื่อนตำแหน่งขึ้นตามแนวแกน y ไป d หน่วย
 	- พิมพ์ Current position : (<x>,<y>) ออกมา
 * moveDown(d) รับ parameter 1 ตัว คือ d
 	- เลื่อนตำแหน่งลงตามแนวแกน y ไป d หน่วย
 	- พิมพ์ Current position : (<x>,<y>) ออกมา
 * moveLeft(d) รับ parameter 1 ตัว คือ d
 	- เลี่อนตำแหน่งไปทางซ้ายตามแนวแกน x ไป d หน่วย
 	- พิมพ์ Current position : (<x>,<y>) ออกมา
 * moveRight(d) รับ parameter 1 ตัว คือ d
 	- เลื่อนตำแหน่งไปทางขวาตามแนวแกน x ไป d หน่วย
 	- พิมพ์ Current position : (<x>,<y>) ออกมา*/
class Point {
	int x,y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		System.out.printf("Current position : (%d,%d)\n", this.x,this.y);
	}
	public void moveUp(int d) {
		this.y += d;
		System.out.printf("Current position : (%d,%d)\n", this.x,this.y);
	}
	public void moveDown(int d) {
		this.y -= d;
		System.out.printf("Current position : (%d,%d)\n", this.x,this.y);
	}
	public void moveLeft(int d) {
		this.x -= d;
		System.out.printf("Current position : (%d,%d)\n", this.x,this.y);
	}
	public void moveRight(int d) {
		this.x += d;
		System.out.printf("Current position : (%d,%d)\n", this.x,this.y);
	}
}
public class Ex012 {
	public static void main(String[] args) {
		Point a = new Point(0,0);
		a.moveUp(20);
		a.moveLeft(23);
		a.moveDown(65);
		a.moveRight(50);
	}
}
