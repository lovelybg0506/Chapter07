package part01.sec01.exam02;

import java.util.Scanner;

public class Ex07_15 {

	public static void main(String[] args) {
		disp();
		output(10, 20, 30);
		int sum = hap(10, 20);
		System.out.println("sum=" + sum);
		int su1=input();
		int su2=input();
		int su3=hap(su1,su2);
		output(su1,su2,su3);
	}

	public static void disp() {	//매개변수도 없고 반환값(return)도 없음
		System.out.println("2021.03.11 메소드공부중..");

	}

	public static void output(int a, int b, int c) { //매개변수는 있는데 반환값없음
		System.out.printf("%d+%d=%d\n", a, b, c);
	
	}

	public static int hap(int a, int b) { // 매개변수도 있고 반환값도있음
		return a + b;
	}
	
	public static int input() { // 매개변수없고 반환값 있음
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력");
		int su=in.nextInt();
		return su;
	}
}
