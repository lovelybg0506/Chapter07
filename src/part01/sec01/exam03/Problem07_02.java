package part01.sec01.exam03;

import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 수를 입력:");
			arr[i]=s.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}

		System.out.println("합계"+sum);
		
	}

}
