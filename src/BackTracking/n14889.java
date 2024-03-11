package BackTracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14889 {
	static int n;
	static int map[][];
	static boolean visit[];
	static int cnt=0;
	static int result=Integer.MAX_VALUE;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		
		map=new int[n][n];
		visit=new boolean[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		back(0,0);
		System.out.println(result);
		
	}
	
	static void back(int idx, int cnt) {
		if(cnt==n/2) {
			diff();
			return;
		}
		for(int i=idx; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				back(i+1,cnt+1);
				visit[i]=false;
			}
		}
	}
	
	static void diff() {
		int startTeam=0;
		int linkTeam=0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(visit[i]==true && visit[j]==true) {
					startTeam+=(map[i][j]+map[j][i]);
				}else if(visit[i]==false && visit[j]==false){
					linkTeam+=(map[i][j]+map[j][i]);
				}
			}
		}
		result=Math.min(result,Math.abs(startTeam-linkTeam)) ;
	}

}
