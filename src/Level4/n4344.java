package Level4;
import java.util.*;
import java.io.*;

public class n4344 {

	public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        int C=fr.nextInt();
        for(int i=0; i<C; i++) {
        	int N=fr.nextInt();
        	Double []score=new Double[N];
        	double sum=0;
        	for(int j=0; j<N; j++) {
        		score[j]=fr.nextDouble();
        		sum+=score[j];
        	}
        	double avg=sum/N;
        	double cnt=0;
        	for(int j=0; j<N; j++) {
        		if(score[j]>avg) cnt+=1;
        	}
        	
        	System.out.printf("%.3f%%\n",cnt/N*100);
        }
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

