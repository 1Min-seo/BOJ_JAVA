package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n11501 {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int t=Integer.parseInt(br.readLine());
      int []num;
      StringTokenizer st;
      
      for(int i=0; i<t; i++) {
         int n=Integer.parseInt(br.readLine());
         long sum=0;
         st =new StringTokenizer(br.readLine()," ");
         num=new int[n];     
         for(int j=0; j<n; j++) 
            num[j]=Integer.parseInt(st.nextToken());

         int max=num[n-1];
         for(int j=n-2; j>=0; j--) {
            if(max>=num[j])
               sum+=max-num[j];
            else
               max=num[j];
         }
         
       System.out.println(sum);
      }   
   }

}