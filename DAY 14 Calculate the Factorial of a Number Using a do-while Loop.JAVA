import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
       
        int num = sr.nextInt();
       
        int fact = 1;
       
        int i = 1;
        do {
            fact *= i; 
            i++;  
        } while (i <= num);  
        System.out.println(fact);
    }
}
