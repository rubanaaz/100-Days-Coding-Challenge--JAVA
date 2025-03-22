import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maxElement = (n > array[0]) ? n : array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println(maxElement);
    }
}
