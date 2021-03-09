package part01.sec01.exam02;

public class Ex07_08 {

	public static void main(String[] args) {
		int aa[]= {10,20,30,40,50};
		int count,size;
		int sum=0;
		
		count=aa.length;
		System.out.println("count:"+count);
		size=count*Integer.BYTES;	// Integer=4byte, 5*4
		System.out.println("size:"+size+"byte");
		
		System.out.printf("배열 aa[] 요소의 갯수는 %d개 입니다.\n",count);
		System.out.printf("배열 aa[] 요소의 전체 크기는 %dbyte 입니다.\n",size);
		
		for(int k:aa) {
			sum+=k;
		}
		System.out.println("합은"+sum);
		
	}

}
