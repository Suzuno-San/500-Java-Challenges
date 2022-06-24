package OPP;

/*เขียนโปรแกรมสร้าง class ชื่อ USDTHB โดยมี attribute และ method ดังนี้ 
attribute
 * amount เป็นจำนวนเงิน
 * currency เป็นสกุลเงิน
method
 * toTHB() ทำหน้าที่แปลงสกุลเงินไปเป็น THB
 * toUSD() ทำหน้าที่แปลงสกุลเงินไปเป็น USD
(กำหนดให้ใช้อัตราแลกเปลี่ยน 1 USD = 30 THB)*/
class USDTHB {
	double amount;
	String currency;
	
	public USDTHB(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	public double toTHB(){
		if(this.currency=="USD") {
			this.amount *= 30;
			this.currency = "THB";
			return this.amount*30;
		}
		else {
			return this.amount;
		}
	}
	public double toUSB() {
		if(this.currency=="THB") {
			this.amount /= 30;
			this.currency = "USD";
			return this.amount/30;
		}
		else {
			return this.amount;
		}
	}
}

public class Ex009 {
	public static void main(String[] args) {
		USDTHB money = new USDTHB(30000,"USD");
		System.out.println(money.amount+" "+money.currency);
		money.toTHB();
		System.out.println(money.amount+" "+money.currency);
		money.toUSB();
		System.out.println(money.amount+" "+money.currency);
	}
}
