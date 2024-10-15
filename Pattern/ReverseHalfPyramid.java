package Pattern;
import java.util.Scanner;

public class ReverseHalfPyramid {
    public static void main(String[] args) {
        
    
    
    int n;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the Value of n: ");
            n = s.nextInt();
        }
        for(int i=n; i>=1; i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(" ");

    }
}
}

    

