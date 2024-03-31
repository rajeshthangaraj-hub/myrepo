package dry.run.pack;

import java.util.Arrays;

public class FindMissingNumberInSequence {

	public static void main(String[] args) {
		
		
		int[] num = {1,5,3,2,8,6,7};
		
		Arrays.sort(num);
		
		// 1,2,3,4,6,7,8  // 30 33 36
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]!=i+1) {
				
				System.out.println(i+1);
				break;
			}
			
		}
				

	}

}
