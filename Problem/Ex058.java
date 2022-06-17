package Problem;

//กำหนดให้ matrix1 = [[1,2,3],[4,5,6],[7,8,9]] เขียนโปรแกรม transpose matrix และพิมพ์ผลลัพธ์ออกมา 
public class Ex058 {
	
	static void print(int[] tranMatrix) {
		System.out.print("[");
		for(int i=0;i<tranMatrix.length;i++) {
			if(i>0) {
				System.out.print(", ");
			}
			System.out.print(tranMatrix[i]);
		}
		System.out.print("]");
	}
	
	static void print2d(int[][] tranMatrix) {
		System.out.print("[");
		for(int i=0;i<tranMatrix.length;i++) {
			if(i>0) {
				System.out.print(", ");
			}
			print(tranMatrix[i]);
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] tranMatrix = {{0,0,0},{0,0,0},{0,0,0}};
		int row = matrix1.length;
		int column = matrix1[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				tranMatrix[j][i] = matrix1[i][j];
			}
		}
		print2d(tranMatrix);
	}
}
