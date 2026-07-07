package app_2;
import java.util.*;
public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long []a = new long[n];
        for(int i = 0; i < n ; i++){
             a[i]= sc.nextLong();
        }
        long maxDis = 0;
        long min = a[0];
        for(int j = 1; j < n;j++){
            if(a[j]>min){
                long temp = a[j]-min;
                if ( temp > maxDis){
                    maxDis= temp;
                }
                
                }
            if ( a[j]<min){
                    min=a[j];
                
            }
        }
        System.out.println(maxDis);
    }
}