package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class n2805 {
	
	public static int BinarySearch(int []trees, int start, int end, int target) {	
		while(start<end) {
			int mid=(start+end)/2;
			int sum=0;
			int remain=0;
			for(int tree:trees) {
				if(tree-mid<=0){
					remain=0;
				}else {
					remain=tree-mid;
				}
				sum+=remain;
			}
			if(sum<target) {
				end=mid;
			}
			else {
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
		
		int result=BinarySearch(trees, trees[0], trees[N-1],M);
		
		System.out.println(result);
	}
}


/*
 * n 나무 수  4 
 * m 집으로 가져가려고 하는 나무 길이  7
 * 높이의 최댓값 구하기
 * 
 * 20 15 10 17
 * 
 * 10  15  17  20
 * 
 * 절단기 (10+20)/2 => 15인 경우
 * 5  0  0  2   => 7
 * target이 7이랑 같으니 절단기 길이 반환
 * 
 * 
 * 절단기가 나무 길이보다 크거나 같으면 0
 * 절단기가 나무 길이보다 작으면 뺀 값 더하기
 */
