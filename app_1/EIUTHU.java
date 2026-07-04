
// letter

package app_1;
import java.util.*;
public class EIUTHU{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int maxOver = Math.min(line1.length(), line2.length());
        int index=0;
        String result1=null;
        String result2=null;
        for(int i=maxOver; i>0; i--){
            result1 =line1.substring(line1.length()-i);
            result2 =line2.substring(0,i);
            if(line1.substring(line1.length()-i).equals(line2.substring(0,i))){
                index=i;
                break;
            }
        }
        //System.out.println(line1.substring(maxOver));
        System.out.print(line1.length()+line2.length()-index);
    }
}