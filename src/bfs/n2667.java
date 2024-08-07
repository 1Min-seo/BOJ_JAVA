package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class n2667 {
	static int n;
	static int map[][];
	static boolean visit[][];
	static int cnt=0;
	static int []town;
	static int []dx= {-1,0,0,1};
	static int []dy= {0,-1,1,0};
	
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		map=new int[n][n];
		visit=new boolean[n][n];
		town=new int[25*25];
		
		for(int i=0; i<n; i++) {
			String tmp=br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j]=tmp.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1 && !visit[i][j]) {
					cnt++;
					bfs(i,j);
				}
			}	
		}
		Arrays.sort(town);
		System.out.println(cnt);
		for(int i: town) {
			if(i!=0) {
				System.out.println(i);
			}			
		}
	}
	
	static void bfs(int x, int y) {
		Queue<Point> queue=new LinkedList<>();
		queue.add(new Point(x,y));
		visit[x][y]=true;
		town[cnt]++;
		while(!queue.isEmpty()) {
			Point point=queue.poll();
			for(int i=0; i<4; i++) {
				int nx=point.x+dx[i];
				int ny=point.y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<n&& ny<n) {
					if(map[nx][ny]==1 && !visit[nx][ny]) {
						queue.add(new Point(nx,ny));
						visit[nx][ny]=true;
						town[cnt]++;
					}
				}
			}	
		}
	}
	
	static class Point {
		int x, y;
		
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
}
