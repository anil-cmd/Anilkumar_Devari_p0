package sample;

public class ReverseString {

	public static void main(String[] args) {
//		approach-1
		String str = "Hello";
		
		char[] chArr = str.toCharArray();
		
		for(int i=chArr.length-1; i>=0; i--) 
		{
			System.out.print(chArr[i]);
		}
		
		System.out.println("");
		
//		approach-2
		
		for(int i = str.length()-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println("");
//		approach-3
		
		StringBuffer sBuffer = new StringBuffer(str);
		System.out.println(sBuffer.reverse());
		
	}

}
