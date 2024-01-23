package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1743 {
	static int map[][];
	static boolean visited[][];
	static int cnt,result;
	static int n,m,k;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		map=new int[n+1][m+1];
		visited=new boolean[n+1][m+1];
		
		for(int i=0; i<k; i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			map[x][y]=1;
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					cnt=0;
					cnt+=dfs(i,j);
					result=Math.max(result, cnt);
				}
			}
		}
		bw.write(result+" ");
		bw.flush();
		bw.close();
	}
	
	static int dfs(int x, int y) {
		cnt++;
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=1 && ny>=1 && nx<n+1 && ny<m+1) {
				if(!visited[nx][ny] && map[nx][ny]==1) {
					dfs(nx, ny);
				}
			}
		}
		return cnt;
	}

}
