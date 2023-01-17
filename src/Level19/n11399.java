package Level19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n11399 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		ArrayList<Integer> time=new ArrayList<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			time.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(time);
		
		int sum=0;
		int totalTime=0;
		
		for(int i=0; i<N; i++) {
			sum+=time.get(i);
			totalTime+=sum;
		}
		
		System.out.println(totalTime);
	}

}
