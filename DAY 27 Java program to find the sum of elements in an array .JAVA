import java.util.Scanner;

public class ArraySum {

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i].trim());
        }

        System.out.println(findSum(arr));
        sc.close();
    }
}
