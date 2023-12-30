package Dijkstra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import org.w3c.dom.Node;

public class n1753 {
	private static int INF=100000000;
	static int v,e,k;
	static List<Node>[]list;
	static int[]dist;

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		v=Integer.parseInt(st.nextToken()); //정점
		e=Integer.parseInt(st.nextToken()); //간선
		k=Integer.parseInt(br.readLine()); //시작점
		list=new ArrayList[v+1];
		dist=new int[v+1];
		
		Arrays.fill(dist, INF);
		
		for(int i=1; i<=v; i++) {
			list[i]=new ArrayList<>();
		}
		
		for(int i=0; i<e; i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			
			list[start].add(new Node(end, weight));
		}
		
		dijkstra(k);
		
		
	}
	
	static void dijkstra(int start) {
		PriorityQueue<Node> queue = new PriorityQueue<>();
		boolean[] chk=new boolean[v+1];
		queue.add(new Node(start,0));
		dist[start]=0;
		
		
	}

}
