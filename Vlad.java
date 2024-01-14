import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vlad {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        int i=0;
        int j=0;
        int n=0;
        String[] arr;
        int[] nums;
        for (i=0;i<N;i++)
        {
            n=Integer.parseInt(br.readLine());
            arr=br.readLine().split(" ");
            nums=new int[n];
            for (j=0;j<n;j++)
            {
                nums[j]=Integer.parseInt(arr[i]);
            }
            
        }
    }
}