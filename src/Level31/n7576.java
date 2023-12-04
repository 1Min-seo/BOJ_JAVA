package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n7576 {
	static int M, N;
	static int map[][];
	static int visited[][];
	static int dx[] = { -1, 0, 0, 1 };
	static int dy[] = { 0, -1, 1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j]==-1) {
					visited[i][j]=-1;
				}
			}
			
		}

		bfs(map);
	
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visited[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}

		int max = -1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (max < visited[i][j]) {
					max = visited[i][j];
				}
			}
		}

		System.out.println(max - 1);
	}

	static void bfs(int[][] map) {
		Queue<Node> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					queue.add(new Node(i, j));
					visited[i][j] = 1;
				}
				
			}
		}

		while (!queue.isEmpty()) {
			Node xNode = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = xNode.x + dx[i];
				int ny = xNode.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if (visited[nx][ny] == 0) {
						queue.add(new Node(nx, ny));
						visited[nx][ny] = visited[xNode.x][xNode.y] + 1;

					}
				}
			}
		}
	}
		
	static class Node {
		int x, y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
