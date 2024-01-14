import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class ForbidInt {
    // static ArrayList<Integer> list = new ArrayList<>();
    // static ArrayList<ArrayList<Integer>> l2 = new ArrayList<>();
    public static boolean canSum(int n, int k, int x, ArrayList<Integer> list, HashMap<Integer, Boolean> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n < 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        for (int i = 1; i <= k; i++) {
            if (i == x) {
                continue;
            }
            list.add(i);
            boolean val = canSum(n - i, k, x, list, memo);
            if (val == true) {
                // l2.add(list);
                memo.put(n - i, true);
                return true;
            }
        }

        memo.put(n, false);
        return false;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr;
        int n = 0;
        int x = 0;
        int k = 0;
        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            n = Integer.parseInt(arr[0]);
            k = Integer.parseInt(arr[1]);
            x = Integer.parseInt(arr[2]);

            boolean val = canSum(n, k, x, list, new HashMap<>());
            if (val == true) {
                System.out.println("YES");
                System.out.println(list.size());
                for (Integer elem : list) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}
