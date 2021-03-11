package part01.sec01.exam02;

public class Ex07_14 {

	public static void main(String[] args) {
		int a=10;
		System.out.println("method study start");
		star();
		star(a);
		star(7);
		System.out.println("method study end");
		
	}
	
	public static void star(int a) { //메소드 : 기능
		for(int i=0;i<a;i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void star() {
		for(int i=0;i<10;i++)
			System.out.print("*");
		System.out.println();

	}	

}
