package Pattern;
import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        int n;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter value of n: ");
            n = s.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    
    
}
