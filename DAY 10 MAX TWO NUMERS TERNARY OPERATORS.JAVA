import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int a, b;
        
        Scanner sr = new Scanner(System.in);
        
        a = sr.nextInt();
        b = sr.nextInt();
        
        int max = (a>b) ? a : b;
        
        System.out.println(max);
    }
}

