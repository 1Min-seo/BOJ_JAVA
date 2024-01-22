package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n2468 {
	static int[] dx = { -1, 0, 0, 1 };
	static int[] dy = { 0, -1, 1, 0 };
	static int n;
	static int map[][];
	static boolean visited[][];
	static int result;
	static int cnt;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];

		int height = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] > height) {
					height = map[i][j];
				}
			}
		}

		result = 0;

		for (int k = 1; k <= height; k++) {
			visited=new boolean[n][n];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] >= k && !visited[i][j]) {
						cnt += dfs(i, j, k);
					}
				}
			}
			result = Math.max(result, cnt);
		}

		bw.write(result+" ");
		bw.flush();
		bw.close();
	}

	static int dfs(int x, int y, int h) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (!visited[nx][ny] && map[nx][ny] >= h) {
					dfs(nx, ny, h);
				}
			}
		}
		return 1;
	}

}
