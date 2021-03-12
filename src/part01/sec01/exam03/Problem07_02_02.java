package part01.sec01.exam03;

public class Problem07_02_02 {

	public static void main(String[] args) {
		int n=5;
		int sum=hap(n);
		System.out.println("1~5의 합:"+sum);
	
	}
	
	public static int hap(int n) { // 1+2+3+4+5
		if(n==1)
			return 1;
		
		int tot =n+hap(n-1); // n=5
		return tot;
	}

}
