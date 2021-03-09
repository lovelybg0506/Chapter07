package part01.sec01.exam01;

public class StringEqualsExample_01 {

	public static void main(String[] args) {
		String strVar1="홍길동";
		String strVar2="홍길동";
								// 여기는 문자열이 같은지? 비교
		if(strVar1==strVar2) { 	//문자열은 다 heap에 저장 ,동일 문자열일경우 참조를 안만듦
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { 
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}		// .equals는 값을 비교하라고 만든 메소드. , 참조대상"홍길동"이 같은지 비교
		
		String strVar3=new String("이순신");
		String strVar4=new String("이순신");	// new를 붙이면 각각 참조
		
		if(strVar3==strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar4는 문자열이 같음");
		}
	}
}
		
		
		
	

