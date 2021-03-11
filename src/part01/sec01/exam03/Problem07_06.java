package part01.sec01.exam03;

import java.util.Scanner;

public class Problem07_06 {

	public static void main(String[] args) {
/*
		Scanner in=new Scanner(System.in);
		int roomsu;
		
		System.out.print("방의 갯수를 입력: ");
		roomsu=in.nextInt();
				
		boolean room[]=new boolean[roomsu+1]; // 빈방:false, 사용중:true
		
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
				room[roomNum]=check;
				break;
			case 2:
				System.out.print("퇴실하실 방의 번호를 입력 : ");
				roomNum=in.nextInt();
				System.out.println(roomNum+"호실에서 퇴실 하셨습니다.");
				room[roomNum]=!check;
				break;
			case 3:
				for(int i=1;i<room.length;i++) {
					if(room[i]==check) {
						System.out.println(i+"번방은 사용중입니다.");
					}else{
						System.out.println(i+"번방은 빈방입니다.");
				}
			}
				break;
				
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
*/
//		========================================아래는 선생님코드==============================

		Scanner in = new Scanner(System.in);
		int roomsu;

		System.out.print("방의 갯수를 입력: ");
		roomsu = in.nextInt();

		boolean room[] = new boolean[roomsu]; // 빈방:false, 사용중:true

		while (true) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료: ");
			int select = in.nextInt();
			if (select == 4)
				break;
			int roomNum;
			boolean check = true;

			// do while(),if else, 배열, for
			switch (select) {
			case 1:
				do {
					System.out.print("입실하실 방의 번호를 입력:");
					roomNum = in.nextInt();
					if (roomNum < 1 || roomNum > roomsu)
						System.out.println(roomNum + "호실은 없습니다.");
					else {
						check = false;
					}
				} while (check);

				if (room[roomNum - 1]) {
					System.out.println(roomNum + "호실은 현재 사용중입니다."); // room[i] default=false, 즉 바로 else로 넘어감
				} else {
					room[roomNum - 1] = true;
					System.out.println(roomNum + "호실에 입실하셨습니다.");
				}
				break;

			case 2:
				do {
					System.out.print("퇴실하실 방의 번호를 입력 : ");
					roomNum = in.nextInt();
					if (roomNum < 1 || roomNum > roomsu)
						System.out.println(roomNum + "호실은 없습니다.");
					else {
						check = false;
					}
				} while (check);
				if (room[roomNum - 1]) {
					room[roomNum - 1] = false;
					System.out.println(roomNum + "호실에서 퇴실하셨습니다.");
				} else {
					System.out.println(roomNum + "호실은 빈방입니다.");
				}
				break;

			case 3:
				for (int i = 0; i < room.length; i++) {
					if (room[i]) {
						System.out.println(i + 1 + "방은 사용중 입니다.");
					} else {
						System.out.println(i + 1 + "방은 빈방 입니다.");
					}
				}
				break;

			default:
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
