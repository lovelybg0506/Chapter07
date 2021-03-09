package part01.sec01.exam02;

public class Ex07_04 {

	public static void main(String[] args) {
			int[] scores= {83,90,87};
			int sum=0;
			double avg=0;
			
			System.out.println("scores[0]:"+scores[0]);
			System.out.println("scores[1]:"+scores[1]);
			System.out.println("scores[2]:"+scores[2]);
			
			for(int i=0;i<3;i++) {
//				sum=scores[0]+scores[1]+scores[2];
				sum+=scores[i]; 		//위와 같음
				
	}
			System.out.println("총합:"+sum);
			avg=sum/(double)scores.length;
			System.out.println("평균:"+avg);
	}

}
