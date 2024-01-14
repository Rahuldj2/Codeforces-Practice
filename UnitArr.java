import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UnitArr {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr;
        int neg = 0;
        int minOps = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            neg = 0;
            minOps = 0;
            arr = br.readLine().split(" ");
            int sum = 0;
            int index = 0;
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(arr[j]);
                if (Integer.parseInt(arr[j])>0)
                {

                }
                if (sum < 0) {
                    arr[j] = String.valueOf("1");
                    sum += 2;
                    minOps++;
                }
            }
            int prod = 1;
            for (int j = 0; j < n; j++) {
                prod *= Integer.parseInt(arr[j]);
            }
            if (prod == -1) {
                minOps++;
            }
            System.out.println(minOps);
        }

    }
}