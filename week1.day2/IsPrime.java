package week1.day2;

public class IsPrime {
	
	public static void main(String[] args) {
		int n=47;
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0){
				
				count++;
				
			}}
			if(count==2) {
				
				System.out.println("The Given number : " + n +" is a Prime");
			}else {
				
				System.out.println("The Given number : " + n +" is a Not Prime");
			}
			
		}
	}
