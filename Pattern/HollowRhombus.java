package Pattern;
import java.util.Scanner;

public class HollowRhombus {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Rhombus Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Hollow Rhombus Star Pattern");
		int i = 1, j, k ;
		
		while ( i <= rows ) 
		{
			j = 1 ;
			while( j <= rows - i ) 
			{
				System.out.print(" ");
				j++;
			}
			k = 1 ;
			while ( k <= rows) 
			{
				if (i == 1 || i == rows || k == 1 || k == rows) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				k++ ;
			}
			System.out.println();
			i++;
		}
	}
}
