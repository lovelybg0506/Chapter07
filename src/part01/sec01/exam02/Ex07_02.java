package part01.sec01.exam02;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] aa=new int[4]; // int aa[]=new int[4];
		int hap;
		int i;
		
		for(i=0;i<=3;i++) {
			System.out.printf("첫번째 숫자를 입력하세요:",i+1);
			aa[i]=s.nextInt();
		}
		hap=aa[0]+aa[1]+aa[2]+aa[3];
		
		System.out.printf("합계==> %d\n",hap);
		
		s.close();
	}

}