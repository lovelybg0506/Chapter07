package part01.sec01.exam03;

import java.util.Scanner;

public class Problem07_05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int com[]=new int[6];
		int select[]=new int[6];
		int i,j;
		int count=0;
		
		for(i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*45)+1;// 1~45 랜덤 수
			for(j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
//		for(i=0;i<com.length;i++) {
//			System.out.println(com[i]);
//		}	위에있는 랜덤숫자 보는코드
	
		for(i=0;i<select.length;i++) {
			do {
				System.out.print(i+1+"번째 수를 입력 ");
				select[i]=s.nextInt();
			}while(select[i]<1 || select[i]>45);
			
			for(j=0;j<i;j++) {
				if(select[i]==select[j]) {
					System.out.println("같은 수를 입력하지 마십시오");
					i--;
					break;
				}

			}	

		}
		//com[]배열에 있는 값과 select[]에 있는 값을 비교하여 맞은 갯수를 체크한다
		for(i=0;i<com.length;i++) {
			for(j=0;j<select.length;j++) {
			if(com[i]==select[j]) {
				count++;
				break;
				}
			}
		}
		System.out.println(count+"개를 맞췄습니다.");
		
		s.close();
	}
	
}