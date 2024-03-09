package Math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n14888 {

	public static int MAX = Integer.MIN_VALUE;
	public static int MIN = Integer.MAX_VALUE;
	public static int[] operType = new int[4];
	public static int number[];
	public static int n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		number = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			operType[i] = Integer.parseInt(st.nextToken());
		}

		dfs(number[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);
	}

	public static void dfs(int num, int index) {
		if (index == n) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (operType[i] > 0) {
				operType[i]--;

				switch (i) {
				case 0:
					dfs(num + number[index], index + 1);
					break;
				case 1:
					dfs(num - number[index], index + 1);
					break;
				case 2:
					dfs(num * number[index], index + 1);
					break;
				case 3:
					dfs(num / number[index], index + 1);
					break;

				}

				operType[i]++;
			}
		}

	}

}

/*
 * + - * / 연산 수에 따라 배열 값이 달라짐 정렬 후 출력
 */
