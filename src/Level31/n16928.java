package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n16928 {
	static int N, M;
	static int[] map = new int[101];
	static int[] visited = new int[101];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<map.length; i++) map[i]=i;
		
		for(int i=0; i<(N+M); i++) {
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			map[x]=y;
			
		}
		
		bfs(1);
		System.out.println(visited[100]);
	}
	
	static void bfs(int x) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(x);
		visited[x]=0;
		
		while(!queue.isEmpty()) {
			int xNode=queue.poll();
			
			for(int i=1; i<=6; i++) {
				int nx=xNode+i;
				
				if(nx>100) return;
				
				if(visited[map[nx]]==0) {
					visited[map[nx]]=visited[map[xNode]]+1;
					queue.add(map[nx]);
				}
			}
		}
	}

}
