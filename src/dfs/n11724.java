package dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class n11724 {
	static int n,m;
	static ArrayList<ArrayList<Integer>> map= new ArrayList<>();
	static boolean []visited;
	static int cnt;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		visited=new boolean[n+1];
		
		for(int i=0; i<=n; i++) {
			map.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			map.get(a).add(b);
			map.get(b).add(a);		
		}
		
		cnt=0;
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				dfs(i);
				cnt++;
			}
		}

		System.out.println(cnt);
	}
	
	static void dfs(int x) {
		visited[x]=true;
		
		for(int j=0; j<map.get(x).size(); j++) {
			int node=map.get(x).get(j);
				
			if(!visited[node]) {
				dfs(node);
			}
		}	
	
	}

}
