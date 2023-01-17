package Level19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n11047 {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		ArrayList<Integer> coinType=new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			coinType.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(coinType,Collections.reverseOrder());
		int cnt=0;

		for(int i=0; i<coinType.size(); i++) {
			cnt+=K/coinType.get(i);
			K%=coinType.get(i);
		}
		System.out.println(cnt);
	}

}
