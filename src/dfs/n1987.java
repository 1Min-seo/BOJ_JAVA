package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1987 {
	static int r, c;
	static int map[][];
	static boolean visited[];
	static int cnt;
	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };
	static int max=Integer.MIN_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new int[r][c];
		visited = new boolean[26];

		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			for (int j = 0; j < c; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}
		
		cnt=1;
		dfs(0,0);

		bw.write(max + " ");
		bw.flush();
		bw.close();
	}

	static void dfs(int x, int y) {
		visited[map[x][y]] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
				if (!visited[map[nx][ny]]) {
					cnt += 1;
					dfs(nx, ny);
				}
			}			
		}
		if (cnt > max) {
			max = cnt;
		}
	}

}
