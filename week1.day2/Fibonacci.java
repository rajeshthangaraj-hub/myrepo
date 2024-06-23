package dry.run.pack;

public class Fibonacci {

	public static void main(String[] args) {

		int fibStart = 0 ;
		
		int fibStart1 = 1;
		
		// 0 ,1 , 1, 2, 3, 5
		
		//int[] intArray= {0};
		
		for(int i=0;i<=10;i++) {
			
			System.out.print(fibStart + " ");
			
			int fibSeries = fibStart + fibStart1;
			
			fibStart = fibStart1;
			fibStart1 = fibSeries;
			
			System.out.print("Hello");
		}

	}

}
