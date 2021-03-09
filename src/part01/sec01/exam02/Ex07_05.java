package part01.sec01.exam02;

public class Ex07_05 {	// 한 class 안에 2개의 메소드
//	private int sum1; // 이렇게 써놓으면 모든 메소드 안에서 사용가능
	// 배열, 메소드(함수), 메소드는 호출(메소드이름)해야 작동한다.(JVM이  main함수부터 호출함)
	public static void main(String[] args) { // main메소드, 범위(block)
		int[] scores = null;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;	// 메소드 안에서만 사용할 수 있는 변수 ,즉 지역변수

		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 sum1=" + sum1); // 260
		
		int sum2=add(new int[] {83,90,87}); // 밑에있는 add메소드 호출
		System.out.println("총합 sum2="+sum2);
		System.out.println();
		
	}
// ================================================== 여기까지 main
	public static int add(int[] scores) { // add메소드, 메소드는 반드시()가 존재한다.
										 // 괄호()안에 선언된 변수를 매개변수라 한다.
		int sum = 0;					// 매개변수란, 외부로부터 값을 받을 수 있는 변수다

		for (int i = 0; i < 3; i++) {

			sum += scores[i]; 
 
		}

		System.out.println("총합 sum=" + sum);
//		System.out.println("총합 sum1=" + sum1); // main안에서만 쓸수잇음(지역변수)

		return sum; // 1.메서드의 종료 2.값을리턴 3.호출한쪽으로감

	}

}


// 참조타입이 아닌 기본타입 변수는 각각의 메소드 안에서만 사용가능. (=지역변수)