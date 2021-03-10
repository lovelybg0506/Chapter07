package part01.sec01.exam03;

import java.util.Scanner;

public class Problem07_06 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int roomsu;
		
		System.out.print("방의 갯수를 입력: ");
		roomsu=in.nextInt();
		
		boolean room[]=new boolean[roomsu]; // 빈방:false, 사용중:true
		
		while(true) {
			System.out.println("1.입실 2.퇴실 3.보기 4.종료: ");
			int select=in.nextInt();
			if(select==4)
				break;
			int roomNum = 0;
			boolean check=true;
			
			// do while(),if else, 배열, for
			switch(select) {
			case 1:
				System.out.print("입실하실 방의 번호를 입력 : ");
				roomNum=in.nextInt();
				System.out.println(roomNum+"호실에 입실하셨습니다.");
				room[roomNum]=true;
				break;
			case 2:
				System.out.print("퇴실하실 방의 번호를 입력 : ");
				roomNum=in.nextInt();
				System.out.println(roomNum+"호실에서 퇴실 하셨습니다.");
				room[roomNum]=false;
				break;
			case 3:
				for(int i=0;i<room.length;i++) {
					if(room[i]=true) {
					System.out.println(roomNum+"방은 사용중입니다.");
					System.out.println(roomNum+"방은 빈방입니다.");
					break;
				}
			}
				
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
