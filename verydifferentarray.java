import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class verydifferentarray {
    public static void reverse(int[] array) {

        // Length of the array
        int n = array.length;

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] arr1 = br.readLine().split(" ");
            int n1 = Integer.parseInt(arr1[0]);
            int n2 = Integer.parseInt(arr1[1]);

            String[] arrOrg = br.readLine().split(" ");
            String[] arr = br.readLine().split(" ");

            int[] l1 = new int[n1];
            int[] l2 = new int[n2];
            for (int j = 0; j < n1; j++) {
                l1[j] = Integer.parseInt(arrOrg[j]);
            }
            for (int j = 0; j < n2; j++) {
                l2[j] = Integer.parseInt(arr[j]);
            }
            Arrays.sort(l1);
            Arrays.sort(l2);
            reverse(l2);

            int left1 = 0;
            int r1 = n1;

            int left2 = 0;
            int r2 = n2;
            int sum = 0;
            int l=0;
            int r=1;
            int j=0;
            if (n1<n2)
            {
                j=n1;
            }
            else
            {
                j=n2;
            }
            while (j>l)
            {
                if (Math.abs(l2[i]-l1[i])>Math.abs(l1[n1-k]-l2[n2-k]))
            }
        }
    }
}
