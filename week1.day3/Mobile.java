package week1.day3;

public class Mobile {

	

/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console 
*/
		
		public void makeCall()
		{
			String mobileModel = "S10";
			
			float mobileWeight = 175F;
			
			System.out.println("mobile model" +mobileModel );
			
			System.out.println("mobileWeight" +mobileWeight );
		}
		
		public void sendMsg()
		{
			boolean isFullCharged = true;
			int mobileCost = 49000;
			System.out.println("isFullCharged " +isFullCharged );
			
			System.out.println("mobileCost " +mobileCost );		
		}
		
		public static void main(String[] args) {
			
			Mobile obj = new Mobile();
			
			System.out.println("This is my mobile " );
			obj.makeCall();
			obj.sendMsg();
		}
		
		

}
