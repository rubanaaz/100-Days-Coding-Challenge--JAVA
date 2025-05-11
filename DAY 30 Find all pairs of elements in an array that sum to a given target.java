import java.util.*;

public class Solution {

    public static List<List<Integer>> findPairsWithSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                if (a + b == target) {
                    int min = Math.min(a, b);
                    int max = Math.max(a, b);
                    String key = min + "," + max;
                    if (!seen.contains(key)) {
                        seen.add(key);
                        result.add(Arrays.asList(min, max));
                    }
                }
            }
        }

        
        result.sort(Comparator.comparingInt(p -> p.get(0)));

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(",");
        int target = scanner.nextInt();
        scanner.close();

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        List<List<Integer>> pairs = findPairsWithSum(arr, target);

        System.out.print("[");
        for (int i = 0; i < pairs.size(); i++) {
            List<Integer> pair = pairs.get(i);
            System.out.print("[" + pair.get(0) + ", " + pair.get(1) + "]");
            if (i < pairs.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
