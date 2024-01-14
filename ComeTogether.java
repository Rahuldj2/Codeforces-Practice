import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.HashMap;

public class ComeTogether {
    static int[][] dir = { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };

    static class Pair {
        int x;
        int y;
        int dist;
        ArrayList<Pair> tracker = new ArrayList<>();

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Pair(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static HashMap<String, Boolean> map = new HashMap<>();

    public static boolean isValid(int row, int col) {
        if (row <= 0 || col <= 0) {
            return false;
        }
        return true;
    }

    public static void bfs(Pair src, Pair dest) {
        Queue<Pair> q = new LinkedList<>();
        q.add(src);
        src.tracker = new ArrayList<>();
        src.tracker.add(src);
        for (Pair elem : src.tracker) {
            System.out.print("(" + elem.x + "," + elem.y + ")" + " ");
        }

        while (!(q.isEmpty())) {
            Pair p = q.poll();
            // String key = String.valueOf(p.x) + String.valueOf(p.y);
            // System.out.println(key);
            // // map.put(key,1);
            // System.out.println("(" + p.x + "," + p.y + ")");
            if (p.x == dest.x && p.y == dest.y) {
                System.out.println("rchd");
                System.out.println(p.dist);
                for (Pair elem : p.tracker) {
                    System.out.print("(" + elem.x + "," + elem.y + ")" + " ");
                }
                System.out.println();
                break;
            }
            for (int i = 0; i < 4; i++) {
                int x = p.x + dir[i][0];
                int y = p.y + dir[i][1];
                ArrayList<Pair> list = p.tracker;
                if (isValid(x, y)) {
                    Pair pr = new Pair(x, y, p.dist + 1);
                    q.add(pr);
                    for (Pair elem : list) {
                        pr.tracker.add(elem);
                    }
                    pr.tracker.add(pr);
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // aim is to calculate shortest path from A-B
        // from A-c
        // calculate common cells visited
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr;
        // int[][] dir = { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };
        ArrayList<Pair> pairList;
        for (int i = 0; i < N; i++) {
            pairList = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                arr = br.readLine().split(" ");
                pairList.add(new Pair(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), 0));
            }
            Pair a = pairList.get(0);
            Pair b = pairList.get(1);
            Pair c = pairList.get(2);
            a.dist = 0;
            bfs(a, b);
            bfs(a, c);

            // int max = 0;
            // for (Map.Entry<String, Integer> elem : map.entrySet()) {
            // if (elem.getValue() > 1) {
            // max++;
            // }
            // }
            // System.out.println(max);
        }
    }
}
