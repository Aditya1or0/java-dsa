package Functions;
import java.util.Scanner;

public class Factorial {
  
    public static void printFactorial(int n) {
        if(n<0){
            System.out.println("Invalid Number");
        }
        else{
        int factorial = 1;
        for(int i=n;i>=1;i--){
             factorial = factorial*i;
        }
            System.out.println(factorial);
            return;
    }
}
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number to Know its Factorial: ");
            int n;
            n = s.nextInt();
            printFactorial(n);
          
        }
    }
    
}
