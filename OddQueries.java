import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddQueries {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i = 0;
        int j = 0;
        String[] arr1;
        String[] arr2;
        int[] arr;
        for (i = 0; i < N; i++) {
            arr1 = br.readLine().split(" ");
            int n = Integer.parseInt(arr1[0]);
            int q = Integer.parseInt(arr1[1]);
            arr2 = br.readLine().split(" ");
            arr = new int[n];
            int sum = 0;
            for (j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(arr2[j]);
            }
            for (j = 0; j < q; j++) {
                arr1 = br.readLine().split(" ");
                int l = Integer.parseInt(arr1[0]);
                int r = Integer.parseInt(arr1[1]);
                int k = Integer.parseInt(arr1[2]);
                sum += (r - l + 1) * k;
                for (int p = 0; p < n; p++) {
                    if (p == l || p == r) {
                        continue;
                    }
                    if (p > l && p < r) {
                        continue;
                    }
                    sum += arr[p];
                }
                if (sum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }
    }

}
