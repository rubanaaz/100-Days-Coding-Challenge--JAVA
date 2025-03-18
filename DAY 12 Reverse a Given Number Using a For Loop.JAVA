import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int reversed = 0;
        
        for (int temp = num; temp != 0; temp /= 10) {
    
            int digit = temp % 10;
            
            reversed = reversed * 10 + digit;
        }
        System.out.println(reversed);
    }
}
