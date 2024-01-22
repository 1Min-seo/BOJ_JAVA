package dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11403 {
	static int n;
	static int[][] map1;
	static boolean[] visited;
	static int[][] map2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map1 = new int[n][n];
		map2 = new int[n][n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map1[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map1[i][j] == 1 && !visited[i]) {
					dfs(i, j);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(map2[i][j] + " ");
			}
		}
	}

	static void dfs(int x, int y) {
		map2[x][y] = 1;
		visited[x] = true;

		for (int k = 0; k < n; k++) {
			if (map1[y][k] == 1) {
				if (map1[x][k] == 0) {
					dfs(x, k);
				}
			}
		}
	}

}
