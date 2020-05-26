package Strings;

public class DataConversion {

	public static void main(String[] args) {
		String str="100A";
		String str1=str.replace("A","");
		int i=Integer.parseInt(str1);
		System.out.println(i);

	}

}
