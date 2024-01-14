import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class GoodArr {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr;
        // int[] nums;
        int j = 0;
        int i = 0;

        int n = 0;
        HashSet<Integer> set = new HashSet<>();
        for (i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            arr = br.readLine().split(" ");
            int flag = 0;
            set = new HashSet<>();
            if (n == 1) {
                System.out.println("NO");
                continue;
            }
            for (String num : arr) {
                if (set.add(Integer.parseInt(num))) {

                } else {
                    flag = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if (flag == 1) {
                continue;
            }
            System.out.println("YES");
        }

    }
}