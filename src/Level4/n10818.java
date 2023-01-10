package Level4;
import java.util.*;
import java.io.*;

public class n10818 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        
        int N=fr.nextInt();
        int []arr=new int[N];
        int max=-1000001;
        int min=1000001;
        
        for(int i=0; i<N; i++) {
        	arr[i]=fr.nextInt();
        }
        
        for(int i=0; i<N; i++) {
        	if(min>arr[i]) min=arr[i];
        	if(max<arr[i]) max=arr[i];
        }
        
        System.out.print(min+" "+max);
    }

         
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}

