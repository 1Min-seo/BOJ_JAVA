package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n7569 {
	static int M,N,H;
	static int [][][]map;
	static int [][][]visited;
	

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		H=Integer.parseInt(st.nextToken());
		
		map=new int[H][N][M];
		visited=new int[H][N][M];
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					map[i][j][k]=Integer.parseInt(st.nextToken());
					
					if(map[i][j][k]==-1) {
						visited[i][j][k]=-1;
					}
				}
			}
		}
		
		bfs(map);

	}
	
	static void bfs(int [][][]map) {
		Queue<Node> queue=new LinkedList<>();
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(map[i][j][k]==1) {
						queue.add(new Node(i,j,k));
						visited[i][j][k]=1;
					}
				}
			}
		}
	}
	
	static class Node{
		int x,y,z;
		
		Node(int z, int x, int y){
			this.z=z;
			this.x=x;
			this.y=y;
		}
	}

}
