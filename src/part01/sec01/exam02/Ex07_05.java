package part01.sec01.exam02;

public class Ex07_05 {
	//배열, 메소드(함수)
	public static void main(String[] args) {
		int[] scores=null;
		scores=new int[] {83,90,87};
		int sum1=0;
		
		for(int i=0;i<3;i++) {
			sum1+=scores[i];
		}
		System.out.println("총합 sum1="+sum1);
		
		
		
	}

}
