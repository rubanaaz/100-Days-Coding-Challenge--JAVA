import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        int n = sr.nextInt();
        
        for (int i=1; i<=n; i++) {
    
            for (char ch='A'; ch<'A'+i; ch++) {
                System.out.print(ch); 
            }
            System.out.println(); 
        }
    }
}
