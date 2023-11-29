package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n1697 {
	static int N, K;
	static int map[];
	static boolean visited[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new int[100001];
		visited = new boolean[100001];
		bfs(N);
	}

	public static void bfs(int n) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(n);
		visited[n]=true;
		
		while(!queue.isEmpty()) {
			int newNode=queue.poll();
			
			if(newNode==K) {
				System.out.println(map[newNode]);
				return;
			}
			if(newNode-1>=0 && !visited[newNode-1]) {
				queue.add(newNode-1);
				visited[newNode-1]=true;
				map[newNode-1]=map[newNode]+1;
			}
			if(newNode+1<100001 && !visited[newNode+1]) {
				queue.add(newNode+1);
				visited[newNode+1]=true;
				map[newNode+1]=map[newNode]+1;
			}
			if(newNode*2<100001 && !visited[newNode*2]) {
				queue.add(newNode*2);
				visited[newNode*2]=true;
				map[newNode*2]=map[newNode]+1;
			}
			
		}
		
	}
}
