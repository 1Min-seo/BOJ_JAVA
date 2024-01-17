package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1931 {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int time[][]=new int[n][2];
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			time[i][0]=Integer.parseInt(st.nextToken());
			time[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, (I1, I2)->{
			if(I1[1]==I2[1]) {
				return I1[0]-I2[0];
			}else {
				return I1[1]-I2[1];
			}
		});
		
		int cnt=0;
		
		int endTime=time[0][1];
		for(int i=1; i<n; i++) {
			if(endTime<=time[i][0]) {
				cnt+=1;
				endTime=time[i][1];
			}
		}
		System.out.println(cnt+1);
	}	

}

