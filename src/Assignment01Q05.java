public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int[] dist = new int[m.length];
        for (int k = 0; k < m.length; k++) {
            dist[k] = -1;
        }
        int[] queue = new int[m.length];
        int head = 0;
        int tail = 0;
        dist[i] = 0;
        queue[tail] = i;
        tail++;
        while (head < tail) {
            int v = queue[head];
            head++;
            for (int c = 0; c < m.length; c++) {
                if (m[v][c] == 1 && dist[c] == -1) {
                    dist[c] = dist[v] + 1;
                    queue[tail] = c;
                    tail++;
                }
            }
        }
        return dist[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}