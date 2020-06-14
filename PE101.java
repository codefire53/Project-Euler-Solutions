/**
 * Problem 101: The main idea is lagrange polynomial with given n+1 points will produce n degrees polynomial that interpolates
 * those points
 */
import java.util.*;
public class PE101 {
    public static void main (String [] args){
        ArrayList <Long> x = new ArrayList <Long>();
        ArrayList <Long> y = new ArrayList <Long>();
        for(long i=0;i < 11;i++){
            x.add(i+1);
            y.add(evaluate(i+1));
        }

        long ans=0;
        for (long t=1;t <= 10;t++){
            long sum=0;
            for (long ti=1; ti <= t;ti++){
                long numerator=1;
                long denom=1;
                for (long tii=1;tii <= t;tii++){
                    if(tii!=ti){
                        numerator*= t+1-tii;
                        denom*=ti-tii;
                    }
                }
                sum+=(numerator*y.get((int)ti-1))/denom;
              
            }
            ans+=sum;
            System.out.println(ans);
            
        }
    }

    public static long evaluate(long x){
        long ans=0;
        long multiplied_tmp=1;
        for(long i=0;i < 11;i++){
            if(i%2==0){
                ans+=multiplied_tmp;
            }
            else{
                ans-=multiplied_tmp;
            }
            multiplied_tmp*=x;
        }
        return ans;
    }
}