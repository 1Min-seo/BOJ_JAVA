package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n16953 {
   public static void main(String[] args)throws Exception {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer(br.readLine());
      
      int a=Integer.parseInt(st.nextToken());
      int b=Integer.parseInt(st.nextToken());
      
      int cnt=0;
      while(a!=b) {
         if(b<a) {
            System.out.println(-1);
            return;
         }
         else if(b%2==0) { //짝수일 때
            b/=2;
         }else if(b%10==1) { //끝 자리가 1일 때
            b/=10;
         }else {
            System.out.println(-1); return;
         }
         cnt+=1;
      }
      
      System.out.println(cnt+1);
   }
}