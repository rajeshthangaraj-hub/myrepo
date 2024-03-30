package dry.run.pack;

public class FindCountOfGivenCharacter {

	public static void main(String[] args) {
		
		
		String test ="Teset Leaef";
		
		int count = 0;
		
		char[] charArray = test.toCharArray();
		
		for(int i=0; i<charArray.length;i++) {
			
			if(charArray[i]=='e') {
				
				count = count +1;
			}
			
		}
		
		System.out.println(count);

	}
	
	

}
