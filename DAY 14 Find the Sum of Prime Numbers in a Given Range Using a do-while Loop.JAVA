import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        int sum = 0;
        int current = start;

        do {
            
            if (current > 1) { 
                int isPrime = 1; 
                
                for (int i = 2; i <= Math.sqrt(current); i++) {
                    if (current % i == 0) {
                        isPrime = 0; 
                        break; 
                    }
                }
                if (isPrime == 1) {
                    sum += current; 
                }
            }
            current++;
        } while (current <= end);
      
        System.out.println(+sum);
    }
}
