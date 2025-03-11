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
        if(a<b) {
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}
