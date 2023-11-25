package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n2606 {
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static boolean []visited;
	static int cnt=0;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vertex=Integer.parseInt(br.readLine());
		int edge=Integer.parseInt(br.readLine());
		
		visited=new boolean[vertex+1];
		
		for(int i=0; i<=vertex; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<edge; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		
		int result= dfs(1);
		
		System.out.println(result);
	}
	
	public static int dfs(int vertex) {
		visited[vertex]=true;
		
		for(int i=0; i<graph.get(vertex).size(); i++) {
			int newNode=graph.get(vertex).get(i);
			
			if(visited[newNode]==false) {
				cnt+=1;
				dfs(newNode);
			}
		}
		return cnt;
	}

}
