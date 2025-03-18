import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num = sr.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime");
        } else {
            int count = 0;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    count++; 
                    break;    
                }
            }
            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
