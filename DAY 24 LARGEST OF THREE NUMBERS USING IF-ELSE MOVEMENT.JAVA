import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sr = new Scanner(System.in);
        a = sr.nextInt();
        b = sr.nextInt();
        c = sr.nextInt();
        if(a>b && a>c) {
            System.out.println(a);
        }
        else if(b>=a && b>=c) {
            System.out.println(b);
        }
        else if(c>=a && c>b) {
            System.out.println(c);
        }
        else if(a==0 && b==0 && c==0) {
            System.out.println("0");
        }
    }
}
