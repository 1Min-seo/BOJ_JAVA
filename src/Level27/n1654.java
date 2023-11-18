package Level27;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n1654 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[] arr = new int[K];
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		long start = 0;
		long end = arr[arr.length - 1]+1;
		long mid=0;

		while (start < end) {
			mid = (start + end) / 2;
			long total = 0;
			for (int i = 0; i < arr.length; i++) {
				total += (arr[i] / mid);
			}

			if (total < N) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		
		System.out.println(start-1);
	}
}
// 
// 457  539  743  801
// start=0  end=802  mid=400
//  1    1    1    2  total=5

// start=0  end=400  mid=200
//  2    2    3    4  total=11

// start=201 end=400 mid=300
//  1    1    2    2  total=6

// start=201 end=300 mid=250
//  1    2    2   3   total=8

// start=201 end=250 mid=225
//  1    2    3   3   total=9

// start=201 end=225 mid=213
//  1    2    3   3  total=9

//start=201  end=213 mid=207
//  1    2    3   3  total=9

//start=201  end=207 mid=204
//  1    2    3   3  total=9

//start=201  end=204 mid 202
//  1    2    3   3  total=9

//start=201  end=202 mid=201
//	1    2    3   3  total=9

//start=201  end=201 mid=201

//return 201-1=200