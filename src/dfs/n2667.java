package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class n2667 {
	static int n;
	static int map[][];
	static boolean visited[][];
	static int cnt; //총 단지 수
	static int []town; //단지에 속하는 집의 수
	static int townNum;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		n=Integer.parseInt(br.readLine());
		map=new int[n][n];
		visited=new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String str=br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j]=str.charAt(j)-'0';
			}	
		}
		
		town=new int[25*25];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					cnt++;
					townNum=0;
					dfs(i,j);
					town[cnt]=townNum;
				}
			}
		}
		
		bw.write(cnt+" ");
		Arrays.sort(town);
		for(int x:town) {
			if(x!=0) {
				bw.newLine();
				bw.write(x+" ");
			}
		}
		bw.flush();
		bw.close();
	}
	
	static void dfs(int x, int y) {
		visited[x][y]=true;
		townNum++;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				if(map[nx][ny]==1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}

}
