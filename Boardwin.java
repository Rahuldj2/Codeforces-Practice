import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boardwin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int numOnes = 0;

        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        for (i = 0; i < N; i++) {
            numOnes = Integer.parseInt(br.readLine());
            if (numOnes > 4) {
                list.add("Alice");
            } else {
                list.add("Bob");
            }
        }
        for (String el : list) {
            System.out.println(el);
        }
    }
}
