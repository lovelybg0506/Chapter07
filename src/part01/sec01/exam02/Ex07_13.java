package part01.sec01.exam02;

public class Ex07_13 {

	public static void main(String[] args) {
		int intArray[];
		intArray=makeArray();
		
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		
	}
	
	static int[] makeArray() {
		int temp[]=new int[4];
		
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
			return temp;
		
	}

}
