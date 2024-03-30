package dry.run.pack;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		
		int input = 121;
		
		String strOutput = "";
		
		// To convert Int into String
		
		String strInput = Integer.toString(input);
		
	// To convert String to char[]
		
		char[] c = strInput.toCharArray();
		
		
	for (int i=c.length-1;i>=0;i--) {
		
		strOutput = strOutput + c[i];		
		
	}
	
	if(strInput.equals(strOutput)){
		
		System.out.println("Given number : "+strInput+" is a Palindrome");
		
	}else {
		
		System.out.println("Given number : "+strInput+" is a Not Palindrome");
	}
	
	

	}

}
