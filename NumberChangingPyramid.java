package Pattern;
import java.util.Scanner;

public class NumberChangingPyramid {
    public static void main(String[] args) {
        
    
    int n;
    int b=1;
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("Enter the value of n");
        n = s.nextInt();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(b+" ");
            b++;
            }
        System.out.println(" ");
        }
        System.out.println();
        }
    }



    

