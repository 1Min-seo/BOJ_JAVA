package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n1260 {
	static ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
	static int vertex;
	static int edge;
	static int start;
	static boolean visited[];

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		vertex=Integer.parseInt(st.nextToken());
		edge=Integer.parseInt(st.nextToken());
		start=Integer.parseInt(st.nextToken());
		
		for(int i=0; i<=vertex; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		visited=new boolean[vertex+1];
		
		for(int i=0; i<edge; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for(int i=1; i<=vertex; i++) {
			Collections.sort(graph.get(i),Collections.reverseOrder());
		}
		
		dfs(start);
		visited=new boolean[vertex+1];
		System.out.println();
		bfs(start);
		
	}
	
	public static void dfs(int v) {
		visited[v]=true;
		System.out.print(v+" ");
		
		for(int i=0; i<graph.get(v).size(); i++) {
			int newNode=graph.get(v).get(i);
			
			if(visited[newNode]==false) {
				dfs(newNode);
			}
		}
	}
	
	public static void bfs(int v) {
		Queue<Integer> queue =new LinkedList<Integer>();
		queue.add(v);
		visited[v]=true;	
		System.out.print(v+" ");
		
		while(!queue.isEmpty()) {
			int start= queue.poll();
			
			for(int i=0; i<graph.get(start).size(); i++) {
				int node=graph.get(start).get(i);
				if(visited[node]==false) {
					queue.add(node);
					visited[node]=true;
					System.out.print(node+" ");
				}		
			}
		}
	}

}
