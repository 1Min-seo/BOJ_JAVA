package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n7569 {
	static int M, N, H;
	static int[][][] map;
	static int[][][] visited;
	static int[] dz = { 0, 0, 0, 0, -1, 1 };
	static int[] dx = { -1, 0, 0, 1, 0, 0 };
	static int[] dy = { 0, -1, 1, 0, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());

		map = new int[H][N][M];
		visited = new int[H][N][M];

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());

					if (map[i][j][k] == -1) {
						visited[i][j][k] = -1;
					}
				}
			}
		}

		bfs(map);

		int max = -1;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (visited[i][j][k] == 0) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, visited[i][j][k]);
				}
			}
		}

		System.out.println(max - 1);
	}

	static void bfs(int[][][] map) {
		Queue<Node> queue = new LinkedList<>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (map[i][j][k] == 1) {
						queue.add(new Node(i, j, k));
						visited[i][j][k] = 1;
					}
				}
			}
		}

		while (!queue.isEmpty()) {
			Node xNode = queue.poll();

			for (int i = 0; i < 6; i++) {
				int nz = xNode.z + dz[i];
				int nx = xNode.x + dx[i];
				int ny = xNode.y + dy[i];

				if (nz >= 0 && nx >= 0 && ny >= 0 && nz < H && nx < N && ny < M) {
					if (visited[nz][nx][ny] == 0) {
						queue.add(new Node(nz, nx, ny));
						visited[nz][nx][ny] = visited[xNode.z][xNode.x][xNode.y] + 1;
					}
				}
			}
		}

	}

	static class Node {
		int x, y, z;

		Node(int z, int x, int y) {
			this.z = z;
			this.x = x;
			this.y = y;
		}
	}

}
