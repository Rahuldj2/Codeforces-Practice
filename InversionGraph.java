import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InversionGraph {

    static boolean[] visited;

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int curVertex) {
        ArrayList<Integer> adjList = graph.get(curVertex);
        visited[curVertex] = true;
        for (int i = 0; i < adjList.size(); i++) {
            int neighbour = adjList.get(i);
            if (!(visited[neighbour])) {
                dfs(graph, neighbour);
            }
        }
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> p) {
        int i = 0, j = 0;
        for (i = 0; i < p.size(); i++) {
            for (j = 0; j < p.size(); j++) {
                if (j > i && p.get(i) > p.get(j)) {
                    ArrayList<Integer> l1 = graph.get(p.get(i));
                    ArrayList<Integer> l2 = graph.get(p.get(j));
                    int jk = p.get(j);
                    int kj = p.get(i);
                    l2.add(kj);
                    l1.add(jk);
                    graph.set(p.get(i), l1);
                    graph.set(p.get(j), l2);
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> graph;
        ArrayList<Integer> list;
        int count = 0;
        int i = 0, k = 0, j = 0;
        for (i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            list = new ArrayList<>();
            String[] nums = br.readLine().split(" ");
            graph = new ArrayList<>();
            visited = new boolean[n + 1];
            count = 0;
            for (j = 0; j < n; j++) {
                graph.add(new ArrayList<>());
                list.add(Integer.parseInt(nums[j]));
            }
            graph.add(new ArrayList<>());
            addEdge(graph, list);
            for (k = 1; k <= n; k++) {
                if (!(visited[k])) {
                    count++;
                    dfs(graph, k);
                }
            }
            System.out.println(count);
        }
    }
}
