package part01.sec01.exam03;

import java.util.Scanner;

//학생수, 국어, 영어, 합, 순위 ==> 배열
public class Problem07_04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int inwon;
		int i,j;
		
		System.out.print("학생 수를 입력: ");
		inwon=s.nextInt();
		String name[]=new String[inwon];
		int kor[]=new int[inwon];
		int eng[]=new int[inwon];
		int tot[]=new int[inwon];
		int rank[]=new int[inwon];
		
		for(i=0;i<name.length;i++) {
			System.out.print(i+1+"번째 학생의 이름: ");
			name[i]=s.next();
			System.out.print(i+1+"번째 학생의 국어점수: ");
			kor[i]=s.nextInt();
			System.out.print(i+1+"번째 학생의 영어점수: ");
			eng[i]=s.nextInt();
			tot[i]=kor[i]+eng[i];
		}
		
		for(i=0;i<name.length;i++) {
			rank[i]=1;
			for(j=0;j<name.length;j++) {
				if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
			
		}
		
		for(i=0;i<name.length;i++) {
			System.out.println(name[i]+"님의 총점은"+tot[i]+"점 이고, 순위는"+rank[i]+"등 입니다.");
		}

		s.close();
	}

}
