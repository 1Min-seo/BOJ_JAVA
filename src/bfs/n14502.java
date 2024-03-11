package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n14502 {
	static int n;
	static int m;
	static int[][] map;
	static boolean[][] visit;
	static int result = Integer.MIN_VALUE;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	static int cnt=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]==0) {
					dfs(i,j,cnt);
				}
			}
		}
	}

	// 벽세우기
	static void dfs(int x, int y, int cnt) {
		if(cnt==3) {
			bfs();
			return;
		}
		visit[x][y]=true;
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<n && ny<m) {
				if(!visit[nx][ny] && map[nx][ny]==0) {
					map[nx][ny]=1;
					dfs(nx,ny,cnt+1);
					map[nx][ny]=0;
					visit[nx][ny]=false;
				}
			}
		}
	}

	// 안전구역 세기
	static void bfs() {
		Queue<Node> queue=new LinkedList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]==2) {
					queue.add(new Node(i,j));
				}
			}
		}
	}
	
	static class Node{
		int x,y;
		Node(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

}
