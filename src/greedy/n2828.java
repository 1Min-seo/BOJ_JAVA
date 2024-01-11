package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2828 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int m=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		
		int j=Integer.parseInt(br.readLine());
		
		int start=1;
		int end=n;
		int distance=n-1;
		
		int cnt=0;
		
		for(int i=0; i<j; i++) {
			int dx=Integer.parseInt(br.readLine());
			
			if(dx>=start && dx<=end) {
				continue;
			}else if(Math.abs(dx-end)<=Math.abs(dx-start)) { //end와 가까우면
				cnt+=(Math.abs(dx-end));
				end=dx;
				start=end-distance;
			
				
			}else if(Math.abs(start-dx)<=Math.abs(end-dx)) { //start와 가까우면
				cnt+=(Math.abs(start-dx));
				start=dx;
				end=start+distance;
		
			}
		}
		
		System.out.println(cnt);
	}

}
