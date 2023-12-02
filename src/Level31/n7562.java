package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n7562 {
	static int tc;
	static int N;
	static int x1, y1, x2, y2;
	static int[] dx = { -2, -2, -1, -1, 1, 1, 2, 2 };
	static int[] dy = { -1, 1, -2, 2, -2, 2, -1, 1 };
	static int cnt;
	static int[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			N = Integer.parseInt(br.readLine());
			visited = new int[N + 1][N + 1];

			StringTokenizer st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			bfs(x1, y1);
		}

	}

	static void bfs(int x, int y) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(x, y));
		visited[x][y] = 0;

		while (!queue.isEmpty()) {
			Node xNode = queue.poll();

			if (xNode.x == x2 && xNode.y == y2) {
				System.out.println(visited[xNode.x][xNode.y]);
				return;
			}
			for (int i = 0; i < 8; i++) {
				int nx = xNode.x + dx[i];
				int ny = xNode.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if(visited[nx][ny]==0) {
						queue.add(new Node(nx, ny));
						visited[nx][ny] = visited[xNode.x][xNode.y]+1;
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