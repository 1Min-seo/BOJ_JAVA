package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class n10026 {
	static int n;
	static char map[][];
	static boolean visited[][];
	static int dx[]= {-1,0,0,1};
	static int dy[]= {0,-1,1,0};
	static int resulta, resultb;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(br.readLine());
		map=new char[n][n];
		visited=new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String str=br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j]=str.charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					resulta++;
					dfs_a(i,j);
				}
			}
		}
		
		visited=new boolean[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]=='R') {
					map[i][j]='G';
				}
				if(!visited[i][j]) {	
					resultb++;
					dfs_b(i,j);
				}		
			}
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(resulta+" ");
		sb.append(resultb+" ");
		bw.write(sb+" ");
		bw.flush();
		bw.close();
	}
	
	static void dfs_a(int x, int y) {
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				if(map[x][y]== map[nx][ny] && !visited[nx][ny]) {
					dfs_a(nx,ny);
				}
			}
		}
	}
	
	static void dfs_b(int x, int y) {
		visited[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<n && ny<n && !visited[nx][ny]) {
				if(map[nx][ny]=='R') {
					map[nx][ny]='G';
				}
				if(map[x][y]== map[nx][ny]) {
					dfs_b(nx,ny);
				}
				
			}
		}
	}

}
