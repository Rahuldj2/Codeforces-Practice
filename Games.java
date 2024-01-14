import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Games {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int homArr[] = new int[N];
        int awArr[] = new int[N];
        int counter = 0;
        int i = 0;
        String[] nums = br.readLine().split(" ");
        int hc = Integer.parseInt(nums[0]);
        int gc = Integer.parseInt(nums[1]);
        for (i = 0; i < N - 1; i++) {
            nums = br.readLine().split(" ");
            if (Integer.parseInt(nums[0]) == gc) {
                counter++;
            }
            if (Integer.parseInt(nums[1]) == hc) {
                counter++;
            }
            hc = Integer.parseInt(nums[0]);
            gc = Integer.parseInt(nums[1]);
        }
        System.out.println(counter);
    }
}
