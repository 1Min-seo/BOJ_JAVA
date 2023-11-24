package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n24480 {
	static ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
	static int visited[];
	static int cnt;

	public static void main(String[] args)throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int vertex=Integer.parseInt(st.nextToken());
		int edge=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(st.nextToken());
		
		visited=new int[vertex+1];
		
		for(int i=0; i<=vertex; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<edge; i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		
		for(int i=1; i<=vertex; i++) {
			Collections.sort(graph.get(i),Collections.reverseOrder());
		}
		
		cnt=1;
		dfs(start);
		
		StringBuilder sb=new StringBuilder();
		for(int i=1; i<visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int vertex) {
		visited[vertex]=cnt;
		
		for(int i=0; i<graph.get(vertex).size(); i++) {
			int newNode=graph.get(vertex).get(i);
			
			if(visited[newNode]==0) {
				cnt++;
				dfs(newNode);
			}
		}
	}

}
