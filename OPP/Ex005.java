package OPP;

/*
เขียนโปรแกรมสร้าง class ชื่อ Book โดยมี attribute และ method ดังนี้
attribute
 * bookName เป็นชื่อของหนังสือ
 * bookStatus เป็นสถานะการยืมของหนังสือ โดย bookStatus มีค่า default เป็น "available"
method
 * borrowBook()
	- ถ้า bookStatus เป็น "available"
		* ให้พิมพ์ "borrow successfull"
		* เปลี่ยน bookStatus เป็น "unavailable"
	- แต่ถ้า เรียกใช้ตอนที่ bookStatus เป็น "unavailable"
		* ให้พิมพ์ "borrow unsuccessfully"
 * returnBook()
	- ถ้า bookStatus เป็น "unavailable"
		* ให้พิมพ์ "return successfully"
		* เปลี่ยน bookStatus เป็น "available"
	- แต่ถ้า เรียกใช้ตอนที่ bookStatus เป็น "availble"
		* ให้พิมพ์ "return unsuccessfully"
*/
class Book {
	String bookName;
	String bookStatus = "available";
	
	public Book(String bookName) {
		this.bookName = bookName;
	}
	public void borrowBook() {
		if(this.bookStatus=="available") {
			System.out.println("borrow successfull");
			this.bookStatus = "unavailable";
		}
		else if(this.bookStatus=="unavailable") {
			System.out.println("borrow unsuccessfully");
		}
	}
	public void returnBook() {
		if(this.bookStatus=="unavailable") {
			System.out.println("return successfully");
			this.bookStatus = "available";
		}
		else if(this.bookStatus=="available"){
			System.out.println("return unsuccessfully");
		}
	}
}

public class Ex005 {
	public static void main(String[] args) {
		Book b1 = new Book("Made in abyss");
		System.out.println("Book status : "+b1.bookStatus);
		b1.borrowBook();
		System.out.println("Book status : "+b1.bookStatus);
		b1.returnBook();
		System.out.println("Book status : "+b1.bookStatus);
	}
}
