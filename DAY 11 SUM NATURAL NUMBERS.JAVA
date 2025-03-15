import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int n, i=0, sum=0;
        
        Scanner sr = new Scanner(System.in);
        
        n = sr.nextInt();
        
        while (i<n) {
            i++;
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
