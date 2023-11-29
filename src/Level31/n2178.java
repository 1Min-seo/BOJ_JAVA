package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n2178 {
	static int N, M;
	static int [][]map;
	static boolean [][]visited;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	static Queue<point>queue=new LinkedList<>();
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		
		for(int i=0; i<N; i++) {
			st=new StringTokenizer(br.readLine());
			String tmp=st.nextToken();
			for(int j=0; j<M; j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}
		
		visited=new boolean[N][M];
		
		bfs(0,0);
		System.out.println(map[N-1][M-1]);
	}
	
	static void bfs(int x, int y) {		
		queue.add(new point(x,y));
		visited[x][y]=true;
		
		while(!queue.isEmpty()) {
			point newNode=queue.poll();
			
			for(int i=0; i<4; i++) {
				int nx=newNode.x+dx[i];
				int ny=newNode.y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<M) {
					if(map[nx][ny]!=0 && !visited[nx][ny]) {
						queue.add(new point(nx,ny));
						map[nx][ny]=map[newNode.x][newNode.y]+1;
						visited[nx][ny]=true;
					}
				}
			}
		}
	}
	
	static class point{
		int x,y;
		
		point(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
}
