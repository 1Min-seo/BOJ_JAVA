package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n2178 {
	static int n;
	static int m;
	static int [][]map;
	static boolean [][]visit;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new int[n][m];
		visit=new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String tmp=br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}
		
		bfs(0,0);
		System.out.println(map[n-1][m-1]);
	}
	
	static void bfs(int x, int y) {
		Queue<Node> queue=new LinkedList<>();
		queue.add(new Node(x, y));
		visit[x][y]=true;
		
		while(!queue.isEmpty()) {
			Node node=queue.poll();
			
			for(int i=0; i<4; i++) {
				int nx=node.x+dx[i];
				int ny=node.y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<n && ny<m) {
					if(!visit[nx][ny] && map[nx][ny]!=0) {
						queue.add(new Node(nx, ny));
						visit[nx][ny]=true;
						map[nx][ny]=map[node.x][node.y]+1;
					}
				}
			}
		}
	}
	
	static class Node{
		int x, y;
		
		Node(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

}
