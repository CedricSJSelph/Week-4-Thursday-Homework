
// Copy and paste:
/**
 *  5 201
	25 2 1 100.5 4 320.5
	125 2 2 40 3 85
	175 2 0 125 3 75
	75 1 0 125
	181 1 2 125
 */
import java.util.Scanner;

public class UnsafeBanks {
	
	public static void main(String[] args) {
		
		PrintArray object = new PrintArray();
	
		int n= 0;
		int limit = 0;
		
		Scanner input = new Scanner(System.in);
	
		n = input.nextInt();
		
		limit = input.nextInt();
		
		double[][] borrowers = new double[n][n];
		
		//Number of bank iterations 'b-borrowers'
		for(int b = 0; b < n; b++){
		
			//Starting balance or bank b
			borrowers[b][0] = borrowers[b][0] +  input.nextInt();
			
			//Number of borrows from bank b
			int ClientCount = input.nextInt();
			
			//Number of clients, 'deduct/add that amount'
			for(int c = 0; c < ClientCount; c++) {
				 
				int bank_Num = input.nextInt();
				
				float loan_amount = input.nextFloat();
				
				//Adds money to new bank
				borrowers[b][bank_Num] += loan_amount;
				
				//Deducts funds from current balance.
				borrowers[b][0] -= loan_amount;
				
			}
		}
		
		System.out.println("---------------------");
		for(int i = 0; i < borrowers.length; i++) {
			for(int j = 0; j < borrowers[0].length; j++) {
				
				System.out.println(i + " , " + j + " : " + borrowers[i][j] + ",  ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println(n + "  " + limit);
		
		System.out.println("Unsafe banks are: ");
		
		System.out.println("-----------");
		System.out.println(borrowers[0][0] + "\n");
		System.out.println(borrowers[0][1] + "\n");
		System.out.println(borrowers[0][2] + "\n");
		System.out.println(borrowers[0][3] + "\n");
		System.out.println(borrowers[0][4] + "\n");
		System.out.println("-----------");
		
		for(int p = 0; p < n; p++) {
			
			
		
			if(borrowers[0][p] < limit) {
				
				System.out.print(p + " ");
				
			}
			
		}
		
		
		
	}
				
			
//			
}
		
	


