package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class n1707 {
	static int tc;
	static int node;
	static int edge;
	static boolean []visited;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
		
		tc=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		
		for(int i=0; i<tc; i++) {
			node=Integer.parseInt(st.nextToken());
			edge=Integer.parseInt(st.nextToken());
			
			for(int j=0; i<=node; i++) {
				arr.add(new ArrayList<>());
			}
			
			visited=new boolean[node+1];
			
			for(int z=0; z<edge; z++) {
				int x=Integer.parseInt(st.nextToken());
				int y=Integer.parseInt(st.nextToken());
				
				arr.get(x).add(y);
			}
			
			dfs(1);
		}
	}

	static void dfs(int start) {
		
	}
}
