package dry.run.pack;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1" ;
		
		String[] split = text.split(" ");
		
				
		Set<String> strSet = new LinkedHashSet<String>();
		
		for(String s : split) {
			
			if(strSet.contains(s)) {
				
				strSet.remove(s);
			}else
			
			strSet.add(s);
			
		}
		//Expected output: “We learn Java basics as part of sessions in week1”
			
			StringBuilder strbuilder = new StringBuilder();
			
			for(String s1 : strSet) {
				
				strbuilder.append(s1).append(" ");
			}
			
	 System.out.println(strbuilder);

	}}
