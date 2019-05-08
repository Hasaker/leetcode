package huahua.graph;

public class FriendCircles {

    /**
     * 1ms 100.00%
     * 44.8MB 47.34%
     */
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int res = 0;

        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                res++;
            }
        }

        return res;
    }

    private void dfs(int[][] M, int[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
}
