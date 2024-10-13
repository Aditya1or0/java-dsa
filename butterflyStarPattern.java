package Pattern;
import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
    int n;
    try (Scanner s = new Scanner(System.in)) {
        System.out.print("Enter the value of n: ");
        n = s.nextInt();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int spaces = 2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        //for second part which is to be reversed
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
             int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    
    
}
}
    

