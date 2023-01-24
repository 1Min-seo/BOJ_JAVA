package Level23;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class n2805 {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> tree=new ArrayList<>();
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			tree.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(tree);
		
		/*
		 [1단계] start=4, end=46 => mid=25
		 가져가는 나무 (0+1+15+17+21)=>54
		 
		 [2단계]start=26, end=46 => mid=36
		 가져가는 나무 (0+0+4+6+10) =>20
		 
		 [3단계]start=37, end=46 => mid=41
		 가져가는 나무 (0+0+0+1+5) => 6 =========> M값보다 작으므로 안됨.
		 */
		int start=0;
		int end=tree.get(N-1);
		long result=0;
		while(start<=end) {
			int mid=(start+end)/2;
			long sum=0;
			
			for(int i=0; i<N; i++) {
				if(tree.get(i)>mid) {
					sum+=tree.get(i)-mid;
				}
			}
			if(sum>=M) {
				// 가져가는 나무가 너무 많은 경우, 절단기 높이를 올려 더 잘라야 한다.
				start=mid+1;
				result=mid;
			}
			else {
				//그렇지 않은 경우, 절단기 높이를 낮추기
				end=mid-1;
			}
		}
		System.out.println(result);
	}
}
