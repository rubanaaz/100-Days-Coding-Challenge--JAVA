import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static  int calculateGCD(int num1, int num2) {
        if (num2==0)
            return num1;
        return calculateGCD(num2, num1%num2);
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        int a = sr.nextInt();
        int b = sr.nextInt();
        
        System.out.println(calculateGCD(a, b));
    }
}
