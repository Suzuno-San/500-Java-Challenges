package Problem;

//เขียนโปรแกรมหาผลบวกของจำนวนเฉพาะ 100 ตัวแรก และพิมพ์ ออกมา
public class Ex019 {
	public static void main(String[] args) {
		int countprime = 0, i = 1, sum=0;
		while(countprime < 100) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count == 2) {
				sum += i;
				countprime++;
			}
			i++;
		}
		System.out.println(sum);
	}
}
