package Level10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class n18870 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int []arr=new int[N];
		int []sorted=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		HashMap<Integer,Integer>map=new HashMap<>();
		
		
		for(int i=0; i<N; i++) {
			sorted[i]=arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank=0;
		for(int key:sorted) {
			//앞선 원소가 이미 순위에 있다면,
			//같은 값을 넣어준다.
			
			if(!map.containsKey(key)) {
				map.put(key, rank++);
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int value:arr) {
			int ranking=map.get(value);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}

}

