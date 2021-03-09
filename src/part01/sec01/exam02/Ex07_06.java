package part01.sec01.exam02;

public class Ex07_06 {

	public static void main(String[] args) {
		int[] aa=new int[100];
		int bb[]=new int[100];
		int i;
		
		for(i=0;i<100;i++) {
			aa[i]=i*2; // aa[0]=0, aa[1]=2, aa[2]=4 ... ,aa[99]=198
			System.out.printf("aa[%d]=%d\n",i,aa[i]);	
		}
		
//		for(i=0;i<100;i++) {
//		bb[i]=aa[i]; // 저장공간=값
//		System.out.printf("bb[%d]=%d\n",i,bb[i]);	
//		}
//		
		for(i=0;i<100;i++) {
			bb[i]=aa[99-i]; // 역순 출력
			System.out.printf("bb[%d]=%d\n",i,bb[i]);	
		}

		

	}

}
