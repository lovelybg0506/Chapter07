package part01.sec01.exam02;

import java.util.Scanner;

public class Ex07_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row, col;

		System.out.print("행의 수를 입력:");
		row = s.nextInt();
		System.out.print("열의 수를 입력");
		col = s.nextInt();

		int[][] aa = new int[row][col]; // 메인프로그램 실행시,직접 메모리 크기 할당(동적할당)
		int i, k;
		int val = 1;

		for (i = 0; i < row; i++) {
			for (k = 0; k < col; k++) {
				aa[i][k] = val;
				val++;
//				System.out.printf("%3d", aa[i][k]); //분리시킬거면 이거쓰면됨
				
			}
		}
		System.out.printf("aa[1][1]부터 aa[%d][%d]까지 출력\n",row,col);
		
		for (i = 0; i < row; i++) {
			for (k = 0; k < col; k++) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println("\n");
		}
		s.close();
	}
}