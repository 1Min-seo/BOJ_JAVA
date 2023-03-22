package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2667 {
	public static int n;
	public static int [][]arr=new int[25][25];
	public static boolean [][]visited=new boolean[25][25];
	public static int []townNum=new int[25*25];
	public static int total=0; //총 단지 수
	public static int dx[]= {-1,0,0,1};
	public static int dy[]= {0,-1,1,0};
	
	public static void dfs(int x, int y) {
		visited[x][y]=true;
		townNum[total]++;
		for(int i=0; i<4; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<n) {
				if(arr[nx][ny]==1 && !visited[nx][ny])
					dfs(nx,ny);
			}
		}
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		arr=new int[n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			String temp=st.nextToken();
			for(int j=0; j<n; j++) {	
				arr[i][j]=temp.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1 && !visited[i][j]) {
					total++;
					dfs(i,j);
				}
			}
		}
		
		//총 단지 수
		System.out.println(total);
		
		Arrays.sort(townNum);
		for(int i=0; i<townNum.length; i++) {
			if(townNum[i]!=0) System.out.println(townNum[i]);
		}
		
	}
}


