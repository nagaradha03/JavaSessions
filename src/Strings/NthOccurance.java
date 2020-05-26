package Strings;
public class NthOccurance {
	public static int nthOccurance(String str, char c1,int n) {
		int occur=0;
		int occurance_index = 0;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch==c1) {
				occur++;
				if(occur==n) {
				occurance_index = i;
			    }}
		}
		return occurance_index;
	}
	public static void main(String[] args) {
		String str= "Welcome to naveen automtion labs";
		char c='e';
		int occurance=3;
		int index = nthOccurance(str,c,occurance);
		if (index == 0){
			System.out.println("The given character/occurance not found");
		}
		else {
			System.out.println("The given character is at index:" +index);
		}
	}

	

}
