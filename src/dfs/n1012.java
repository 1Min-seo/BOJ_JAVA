package dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n1012 {
	static int dx[]= {-1,0,0,1};
	static int dy[]= {0,-1,1,0};
	static int tc;
	static int m,n,k;
	static int [][]map;
	static boolean [][]visited;
	static int cnt;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		tc=Integer.parseInt(br.readLine());
	
		for(int i=0; i<tc; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			map=new int[m][n];
			visited=new boolean[m][n];
			
			for(int j=0; j<k; j++) {
				st=new StringTokenizer(br.readLine());
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				
				map[x][y]=1;
			}
			
			cnt=0;
			
			for(int a=0; a<m; a++) {
				for(int b=0; b<n; b++) {
					if(map[a][b]==1 && !visited[a][b]) {
						dfs(a,b);
						cnt+=1;
					}	
				}
			}
			System.out.println(cnt);
		}
	}
	
	static void dfs(int x, int y) {
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<m && ny<n) {
				if(!visited[nx][ny] && map[nx][ny]==1) {
					dfs(nx,ny);
				}
			}
		}
	}

}
