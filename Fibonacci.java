package Functions;
import java.util.Scanner;

public class Fibonacci {
  
    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Max value you want to print series: ");
        n = s.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(firstTerm + ", ");
    
          // compute the next term
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
      }     
}
