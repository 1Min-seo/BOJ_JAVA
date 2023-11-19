package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n2805 {
	public static int binarySearch(int[]trees,int start, int end, int target) {
		while(start<end) {
			long total=0;
			int mid=(start+end)/2;
			for(int i=0; i<trees.length; i++) {
				if(trees[i]-mid>0) {
					total+=(trees[i]-mid);
				}
			}
			if(total<target) {
				end=mid;
			}else {
				start=mid+1;
			}
		}
		return start-1;
	}
		
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int []trees=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			trees[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(trees);
		
		int result=binarySearch(trees,1, trees[trees.length-1], M);
		System.out.println(result);
	}
}


/*
 * total이 7이 되어야 함
 * 10	15	17	20
 * 
 * lo=0	hi=21	mid=10
 * 
 * 0	5	2	10	total=17
 * 
 * lo=11	hi=21	mid=16
 * 
 * 0	0	1	4	total=5
 * 
 * lo=16	hi=21	mid=18
 * 
 * 0	0	0	2	total=2
 * 
 * lo=16	hi=18	mid=17
 * 
 * 0	0	0	3	total=3
 * 
 * lo=16	hi=17	mid=16
 * 
 * 0	0	1	4	total=5
 * 
 * 10=16	hi=16	mid=16
 * 
 * return 16-1=15
 */
