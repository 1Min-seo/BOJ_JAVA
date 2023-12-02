package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n24444 {
	static int node ,edge, start;
	static int x,y;
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
	static int visited[];
	static int cnt=1;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		node=Integer.parseInt(st.nextToken());
		edge=Integer.parseInt(st.nextToken());
		start=Integer.parseInt(st.nextToken());
		
		for(int i=0; i<node+1; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<edge; i++) {
			st=new StringTokenizer(br.readLine());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		
		for(int i=1; i<=node; i++) {
			Collections.sort(arr.get(i));
		}
		
		visited=new int[node+1];
		
		bfs(start);
		for(int i=1; i<visited.length; i++) {
			System.out.println(visited[i]);
		}
	}
	
	static void bfs(int node) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(node);
		visited[node]=cnt;
		
		while(!queue.isEmpty()) {
			int xNode=queue.poll();
			
			for(int i=0; i<arr.get(xNode).size(); i++) {
				int newNode=arr.get(xNode).get(i);
				if(visited[newNode]==0) {
					queue.add(newNode);
					++cnt;
					visited[newNode]=cnt;
				}
			}
		}
		
	}

}
