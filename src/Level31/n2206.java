package Level31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class n2206 {
	
	static class Node{
		int x,y,cnt;
		boolean destroyed;
		
		Node(int x, int y, int cnt, boolean d){
			this.x=x;
			this.y=y;
			this.cnt=cnt;
			this.destroyed=d;
		}
	}
	
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [][]map=new int[N][M];
		boolean [][][]visited=new boolean[N][M][2];
		
		for(int i=0; i<N; i++) {
			String tmp=br.readLine();
			for(int j=0; j<M; j++) {
				map[i][j]=tmp.charAt(j);
			}
		}
		
		Queue<Node> queue =new LinkedList<>();
		queue.add(new Node(0,0,1,false));
		
		while(!queue.isEmpty()) {
			Node xNode=queue.poll();
			
			if(xNode.x==N-1 && xNode.y==M-1) {
				System.out.println(xNode.cnt);
				return;
			}
			
			int []dx= {-1,0,0,1};
			int []dy= {0,-1,1,0};
			
			for(int i=0; i<4; i++) {
				int nx=xNode.x+dx[i];
				int ny=xNode.y+dy[i];
				
				if(nx<0 || ny<0 || nx>=N || ny>=M ) continue;
				
				int next_cnt=xNode.cnt+1;
				
				if(map[nx][ny]=='0') { //벽이 아니면
					if(!xNode.destroyed && !visited[nx][ny][0]) {
						queue.add(new Node(nx,ny,next_cnt,false));
						visited[nx][ny][0]=true;
					}else if(xNode.destroyed && !visited[nx][ny][1]) {
						queue.add(new Node(nx,ny,next_cnt,true));
					}
				}else if(map[nx][ny]=='1') {
					if(!xNode.destroyed) {
						queue.add(new Node(nx,ny,next_cnt, true));
						visited[nx][ny][1]=true;
					}
				}
			
			}
		}
		System.out.println(-1);
	}
	
	

}

/*
 * 1. 벽이 아닌 경우 1) 벽을 부순 적이 있는 경우
 *				 2) 벽을 부순 적이 없는 경우
 *
 *2. 벽인 경우		1)벽을 부순 적이 있는 경우 pass
 *				2)벽을 부순 적이 없는 경우
 * 
 */
