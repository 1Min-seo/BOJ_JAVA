package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n20365 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String str = br.readLine();
		char arr[] = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i]=str.charAt(i);
		}
		
		int colorB = 0;
		int colorR = 0;

		if (arr[0] == 'B') {
			colorR += 1;
		} else {
			colorB += 1;
		}
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				if (arr[i + 1] == 'B') {
					colorR += 1;
				} else {
					colorB += 1;
				}
			}
		}

		System.out.println(Math.min(colorR, colorB) + 1);
	}

}
