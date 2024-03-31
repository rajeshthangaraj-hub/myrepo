package week1.day2;

public class IsOdd {
	
	public static void main(String[] args) {
		int count=0;
						for(int i=1;i<=15;i++) {
					if(i%2!=0) {
						System.out.println(i);
						count++;
					}
															
				}
						System.out.println("Total odd number <15 is " + count);
	}

}
