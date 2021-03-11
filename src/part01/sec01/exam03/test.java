package part01.sec01.exam03;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		boolean run=true;
		int 학생수=0;
		int[] 상자=null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택>");
			
			int 번호선택=scanner.nextInt();
			
			if(번호선택==1) {
				System.out.print("학생수>");
				학생수=scanner.nextInt();
				상자 = new int[학생수];	// 상자에 길이를 넣고.
			}
			
			else if(번호선택==2) {
				for(int i=0;i<상자.length;i++) {
					System.out.print("scores["+i+"]>");
					상자[i] = scanner.nextInt(); // 첫상자부터 점수를 넣는다
				}
			}
			
			else if(번호선택==3) {
				for(int i=0;i<상자.length;i++) {
					System.out.println("scores["+i+"]"+상자[i]);
				}
			}
			
			else if(번호선택==4) {
				// 최고점수와 평균
				
			}
			
			else if(번호선택==5) {
				// 종료
		
			}
			
			System.out.println("프로그램 종료");
		}
	}

}
