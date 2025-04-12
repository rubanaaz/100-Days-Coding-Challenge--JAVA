import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i, j, n;
        
        Scanner sr = new Scanner(System.in);
        
        n = sr.nextInt();
        
        for (i=n; i>=1; i--) {
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
