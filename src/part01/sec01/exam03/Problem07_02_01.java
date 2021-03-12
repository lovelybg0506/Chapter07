package part01.sec01.exam03;

public class Problem07_02_01 {

	public static int getNumber() {
		
		return (int)(Math.random()*45)+1;
	}

	public static void main(String[] args) {
		int[] lotto= {0,0,0,0,0,0};
		int i,k;
		
		System.out.printf("**로또 추첨을 시작합니다.**\n\n");
		
		for(i=0;i<lotto.length;i++) {
			lotto[i]=getNumber();
				for(k=0;k<i;k++) {
					if(lotto[i]==lotto[k]) {
						i--;
						break;
					}
				}
		}
		
		System.out.printf("추첨된 로또번호==>");
		for(i=0;i<lotto.length;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		
	}

}
