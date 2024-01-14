import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeSort {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr;
        // int[] nums;
        int j = 0;
        int i = 0;
        int diff = 0;
        int l = 0;
        int ct = 0;
        int n = 0;
        for (i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            diff = Integer.MAX_VALUE;
            l = 0;
            System.out.println("enter");
            for (j = 0; j < n - 1; j++) {
                if (Integer.parseInt(arr[j + 1]) < Integer.parseInt(arr[j])) {
                    System.out.println(0);
                    break;
                }
                if (Integer.parseInt(arr[j + 1]) - Integer.parseInt(arr[j]) < diff) {
                    l = j;
                    diff = Integer.parseInt(arr[j + 1]) - Integer.parseInt(arr[j]);
                }
            }
            if (j != n - 1) {
                continue;
            }
            ct = 0;
            int p = Integer.parseInt(arr[l]);
            int q = Integer.parseInt(arr[l + 1]);
            while (p <= q) {
                p++;
                p--;
                ct++;
            }
            System.out.println(ct);
        }
    }
}
