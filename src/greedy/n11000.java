package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture{
	int start;
	int end;
	
	Lecture(int start, int end){
		this.start=start;
		this.end=end;
	}
}
public class n11000 {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n=Integer.parseInt(br.readLine());
		Lecture[]lectures=new Lecture[n];
		
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			
			int start =Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			lectures[i]=new Lecture(start,end);
		}
		

		Arrays.sort(lectures,(I1, I2)-> I1.start==I2.start ? I1.end-I2.end : I1.start-I2.start);
		;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(lectures[0].end);
		
		for(int i=1; i<n; i++) {
			if(pq.peek()<=lectures[i].start) {
				pq.poll();
			}
			pq.offer(lectures[i].end);
		}
		System.out.println(pq.size());
	}

}
