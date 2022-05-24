package sample;

public class RemoveSpaces {

	public static void main(String[] args) {

		String str = "  J a  v a  s t a  r  ";
		
		String str1 = new String(str);
		

		System.out.println(str1.replaceAll("\\s", ""));

	}

}
