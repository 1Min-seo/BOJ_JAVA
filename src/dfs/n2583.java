package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2583 {
	static int m,n,k;
	static int map[][];
	static boolean visited[][];
	static int cnt; //영역의 총 개수
	static int area[]; //영역의 넓이
	static int dx[]= {-1,0,0,1};
	static int dy[]= {0,-1,1,0};

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		m=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		map=new int[n+1][m+1];
		visited=new boolean[n+1][m+1];
		area=new int[m*n];
		
		for(int i=0; i<k; i++) {
			st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			for(int x=x1+1; x<=x2; x++) {
				for(int y=y1+1; y<=y2; y++) {
					map[x][y]=1;
				}
			}
		}
		
		cnt=0;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(map[i][j]==0 && !visited[i][j]) {
					cnt++;
					dfs(i,j);
				}
			}
		}
		
		bw.write(cnt+" ");
		bw.newLine();
		Arrays.sort(area);
		StringBuilder sb=new StringBuilder();
		for(int x:area) {
			if(x!=0) {	
				sb.append(x+" ");
			}
		}
		bw.write(sb+" ");		
		bw.flush();
		bw.close();	
	}
	
	static void dfs(int x, int y) {
		visited[x][y]=true;
		area[cnt]++;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
				
			if(nx>=1 && ny>=1 && nx<n+1 && ny<m+1) {
				if(map[nx][ny]==0 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}

}
