package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n24444 {
	static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
	static boolean visited[];
	static int vertex;
	static int edge;
	static int start;
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		vertex=Integer.parseInt(st.nextToken());
		edge=Integer.parseInt(st.nextToken());
		start=Integer.parseInt(st.nextToken());
		
		visited=new boolean[vertex+1];
		for(int i=0; i<=vertex; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<edge; i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		for(int i=0; i<=vertex; i++) {
			Collections.sort(graph.get(i));
		}
		
		bfs(start);

	}
	
	public static void bfs(int v) {
		Queue<Integer>queue=new LinkedList<>();
		int cnt=0;
		int []seq=new int[vertex+1];
		queue.add(v);
		visited[start]=true;
		seq[v]=++cnt;
		
		while(!queue.isEmpty()) {
			int now=queue.poll();
			
			for(int i=0; i<graph.get(now).size(); i++) {
				int newVertex= graph.get(now).get(i);
				if(visited[newVertex]==false) {
					queue.add(newVertex);
					visited[newVertex]=true;
					seq[newVertex]=++cnt;
				}
			}
		}
		for(int i=1; i<=vertex; i++) {
			System.out.println(seq[i]);
		}
	}

}
