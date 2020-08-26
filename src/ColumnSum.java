import java.util.Scanner;

public class ColumnSum {
	
	public static void main(String[] args) {
	
		
		double[][] m_List = new double[3][4];
	
		System.out.println("Enter 3-by-" + 4 +" matrix row by row: ");
		
		sumColumn(m_List, m_List[0].length);
		
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		Scanner input = new Scanner(System.in);
		
		
		int columns = columnIndex;
		int rows = 3;
		
		//Rows
		for(int i = 0; i < rows; i++) {
			//Columns
			for(int j = 0; j < columns; j++) {
				m[i][j] = input.nextInt();
			}
		}
		
		//Rows
		for(int i = 0; i < columns; i++) {
			
			double total = 0;
			
			//Columns
			for(int j = 0; j < rows; j++) {
				
			total += m[j][i];
			
			}
			
			System.out.println("Sum of Elements at column " + i + " is " + total);
		}
		return columnIndex;
	}
}
