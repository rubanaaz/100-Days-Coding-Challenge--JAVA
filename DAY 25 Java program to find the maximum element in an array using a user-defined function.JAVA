import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static int findMax(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String inputLine = sr.nextLine();
        String[] parts = inputLine.split(",");
        int[] arr = new int[parts.length];
        int size = 0;
        for (String part : parts) {
            arr[size] = Integer.parseInt(part.trim());
            size++;
        }
        int max = findMax(arr, size);
        System.out.println(max);
    }
}
