package part01.sec01.exam03;

import java.util.Scanner;

public class Problem07_02_03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("팩토리얼 수를 입력 : ");
		int su=in.nextInt();
		
		int res=factorial(su);
		
		System.out.println(su+"의 팩토리얼 값 : "+res);
	}

	private static int factorial(int su) {
		if(su==1)
			return 1;
		return su*factorial(su-1);
	}

}
