package OPP;
/*เขียนโปรแกรมสร้าง class Tree โดยมี attribute และ method ดังนี้
attribute
 * height เป็นความสูงต้นไม้
 * width เป็นความกว้างต้นไม้
 * generatedMoney เป็นเงินที่หาได้
method
 * feedA() ทำหน้าที่แสดงค่าเงินที่หาได้ และความกว้างของต้นไม้หลังจากให้ปุ๋ยชนิด A โดยจะลด generatedMoney 10 หน่วย แต่จะเพิ่ม width 12 หน่วย
 * feedB() ทำหน้าที่แสดงค่าเงินที่หาได้ และความสูงของต้นไม้หลังจากให้ปุ๋ยชนิด B โดยจะลด generatedMoney 8 หน่วย แต่จะเพิ่ม height 10 หน่วย
 * sell() ทำหน้าที่แสดงค่าจำนวนเงินที่ขายต้นไม้ได้ โดย generatedMoney จะเพิ่มเท่ากับ width*height*0.8 */
class Tree {
	int height, width;
	double generatedMoney;
	
	public Tree(int height, int width, double generatedMoney) {
		this.height = height;
		this.width = width;
		this.generatedMoney = generatedMoney;
	}
	public void feedA() {
		this.width += 12;
		this.generatedMoney -= 10;
	}
	public void feedB() {
		this.height += 10;
		this.generatedMoney -= 8;
	}
	public void sell() {
		this.generatedMoney += this.width*Math.pow(this.height,0.8);
		System.out.printf("Width = %d, Height = %d\n", this.width,this.height);
		System.out.println("Generated money = "+this.generatedMoney);
	}
}

public class Ex015 {
	public static void main(String[] args) {
		Tree tree1 = new Tree(10,10,1000);
		tree1.feedA();
		tree1.feedB();
		tree1.sell();
	}
}
