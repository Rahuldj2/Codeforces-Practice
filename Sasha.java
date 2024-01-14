import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sasha {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i, j, n, l, r, cost = 0;
        int[] arr;
        for (i = 0; i < N; i++) {

            n = Integer.parseInt(br.readLine());
            String[] stArr = br.readLine().split(" ");
            cost = 0;
            arr = new int[n];
            for (j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(stArr[j]);
            }
            Arrays.sort(arr);
            l = 0;
            r = arr.length - 1;
            while (l < r) {
                cost += arr[r] - arr[l];
                l++;
                r--;
            }
            System.out.println(cost);
        }
    }
}
