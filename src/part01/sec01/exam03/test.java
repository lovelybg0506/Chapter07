package part01.sec01.exam03;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	/*
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
*/
//====================================================================================================

		Scanner s= new Scanner(System.in);
		int select;
		int roomsu;
		int roomNum;
		System.out.print("방의 갯수 입력:");
		roomsu = s.nextInt();
		boolean room[]= new boolean[roomsu];
		boolean check = true;
		
		while(true) {
		System.out.print("1.입실|2.퇴실|3.조회|4.종료");
		select = s.nextInt();
			if(select==4) {
				break;
			}
		
		switch(select) {
			case 1:
				System.out.print("입실하실 방 번호를 입력해주세요.");
				roomNum=s.nextInt();
				
				do{
					if(roomNum<1 || roomNum>roomsu)
						System.out.println("없는 방번호 입니다.");
					else {
					check=false;
					}
				}while(check);
				
				if(room[roomNum-1]) {
					System.out.println("사용중인 방입니다.");
				}else {
					room[roomNum-1]=true;
					System.out.println(roomNum+"호 실에 입실 하셨습니다.");
				}
				break;
			
			case 2:
				System.out.print("퇴실하실 방 번호를 입력해주세요.");
				roomNum=s.nextInt();
				do{
					if(roomNum<1 || roomNum>roomsu)
						System.out.println("없는 방번호 입니다.");
					else {
					check=false;
					}
				}while(check);
				
				if(room[roomNum-1]) {
					room[roomNum-1]=false;
					System.out.println(roomNum+"호 실에서 퇴실하셨습니다.");
				}else {
					System.out.println(roomNum+"호 실은 빈방입니다.");
				}	
				break;
		
			case 3:
				for(int i=0;i<room.length;i++) {
					if(room[i]) {
					System.out.println(i+1+"호실은 사용중입니다.");
					}else {
					System.out.println(i+1+"호실은 빈방입니다.");
					}
					
				}
				break;
				
				default:
					System.out.println("잘못입력하셨습니다.");
		}
			}	
		System.out.print("프로그램을 종료합니다.");
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
