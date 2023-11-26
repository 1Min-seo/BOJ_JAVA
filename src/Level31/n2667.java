package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2667 {
	static int N;
	static int [][]map=new int[25][25];
	static boolean[][]visited=new boolean[25][25];
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	static int []apartNum=new int[25*25];
	static int town=0;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		visited=new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String tmp=st.nextToken();
			for(int j=0; j<N; j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					town++;
					dfs(i,j);
				}
			}
		}

		System.out.println(town);
		
		Arrays.sort(apartNum);
		for(int i=0; i<apartNum.length; i++) {
			if(apartNum[i]==0) continue;
			else System.out.println(apartNum[i]);
		}
	}
	
	public static void dfs(int x, int y) {
		visited[x][y]=true;
		apartNum[town]++;
		
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny<N) {
				if(map[nx][ny]==1 && !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
		
	}
}
