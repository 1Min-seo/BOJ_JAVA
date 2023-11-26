package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1012 {

	static int M ,N, K;
	static int [][]map;
	static boolean [][]visited;
	static int cnt;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			M=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			K=Integer.parseInt(st.nextToken());
			
			map=new int[M][N];
			visited=new boolean[M][N];
			
			for(int j=0; j<K; j++) {
				st=new StringTokenizer(br.readLine());
				int p1=Integer.parseInt(st.nextToken());
				int p2=Integer.parseInt(st.nextToken());
				map[p1][p2]=1;
			}
			
			cnt=0;
			
			for(int x=0; x<M; x++) {
				for(int y=0; y<N; y++) {
					if(map[x][y]==1 && !visited[x][y]) {
				
						dfs(x,y);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void dfs(int x, int y) {
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<M && ny<N) {
				if(map[nx][ny]==1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}

}
