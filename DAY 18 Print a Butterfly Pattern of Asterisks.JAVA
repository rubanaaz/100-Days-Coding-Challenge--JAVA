import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      
        for (int i = 1; i <= n; i++) {
            printStars(i);
            printSpaces(2 * (n - i) + 1);  
            printStars(i);
            System.out.println();
        }
        
        // Lower half
        int start = (n % 2 == 0) ? n : n - 1; 
        for (int i = start; i >= 1; i--) {
            printStars(i);
            printSpaces(2 * (n - i) + 1);  
            printStars(i);
            System.out.println();
        }
    }
    
    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
