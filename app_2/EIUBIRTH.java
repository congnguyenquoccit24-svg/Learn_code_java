package app_2;
import java.util.*;
public class EIUBIRTH {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(repeat!=0){
            int blue = sc.nextInt();
            int red = sc.nextInt();
            int moBlue = sc.nextInt();
            int moRed = sc.nextInt();
            int swap = sc.nextInt();
            sb.append(cheapValue(blue,red,moBlue,moRed,swap)).append("\n");
            repeat--;
        }
        System.out.print(sb);
    }
    static int cheapValue(int b, int r, int mB, int mR, int s){
        if(mB+s<mR){
            return (b+r)*mB+(r*s);
        }
        else if(mR+s<mB){
            return (b+r)*mR+(b*s);
        }
        return (b*mB)+(r*mR);
    }
}
