package part01.sec01.exam03;

import java.util.Scanner;

//키보드로부터 인원수를 입력받아 동적배열을 만들고 만들어진 배열 길이 만큼
// 이름을 입력하여 출력하는 프로그램
public class Problem07_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int inwon;
		int i;
		
		System.out.print("인원수를 입력하세요: ");
		inwon = s.nextInt();
		String name[]=new String[inwon];  // **
		
		for(i=0;i<name.length;i++) {
			System.out.print(i+1+"번째 이름: ");
			name[i]=s.next();
		}
		
		for(i=0;i<name.length;i++) {
			System.out.println(i+1+"번째 이름은 "+name[i]+"님 입니다.");
		}
	
	s.close();

	}
}

