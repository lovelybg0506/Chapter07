package part01.sec01.exam02;

import java.util.Scanner;

//for, if
public class Ex07_07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int intArray[]=new int[5];
		int max=0;

		for(int i=0;i<5;i++) {
			intArray[i]=s.nextInt();
			if(max<intArray[i]) {
				max=intArray[i];
				
			}
		}
		System.out.print("입력된 수 중에서 가장 큰 수는"+max+"입니다.");
		
	}

}
