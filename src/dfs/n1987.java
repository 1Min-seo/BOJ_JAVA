package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1987 {
	static int r;
	static int c;
	static int map[][];
	static boolean visit[];
	static int cnt=1;
	static int result=Integer.MIN_VALUE;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		map=new int[r][c];
		visit=new boolean[26];
		
		for(int i=0; i<r; i++) {
			String tmp=br.readLine();
			for(int j=0; j<c; j++) {
				map[i][j]=tmp.charAt(j)-'A';
			}
		}
		
		dfs(0,0);
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();

	}
	
	static void dfs(int x, int y) {
		visit[map[x][y]]=true;
		result=Math.max(cnt, result);
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && nx<r && ny>=0 && ny<c) {
				if(!visit[map[nx][ny]]) {
					cnt+=1;
					dfs(nx,ny);
					visit[map[nx][ny]]=false;
					cnt-=1;
				}
			}
		}
	}

}
