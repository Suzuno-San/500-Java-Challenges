package Problem;

//เขียนโปรแกรมหาจำนวนเฉพาะ 100 ตัวแรก และพิมพ์ออกมา
public class Ex018 {
	public static void main(String[] args) {
		int countprime = 0, i=1;
		while(countprime < 100) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println((countprime+1)+") "+i);
				countprime++;
			}
			i++;
		}
	}
}
