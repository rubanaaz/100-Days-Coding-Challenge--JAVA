import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        int a = 0, b = 1;
        
        System.out.print(a);
        while (b <= num) {
            System.out.print(" " + b);
            int next = a + b;
            a = b;
            b = next;
        } 
    }
}
