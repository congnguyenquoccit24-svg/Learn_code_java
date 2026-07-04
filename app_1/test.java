package app_1;
import java.util.*;
public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int place=1;
        if(!line1.contains(String.valueOf(line2.charAt(0)))){
            System.out.print(line1.length()+line2.length());
        }
        else{
            char endL1 = line1.charAt(line1.length()-1);
            char nearL1 = line1.charAt(line1.length()-2);
            for(int i=0; i<line2.length(); i++){
                if(nearL1==line2.charAt(i) && endL1==line2.charAt(i+1)){
                    place = i+2;
                    break;
                }
            }
            //System.out.println(place+" "+endL1+" "+nearL1+" "+line2.charAt(place));
            System.out.print(line1.length()+line2.length()-place);
        }
    }
}


static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        for(int i=0; i<lengthArr; i++){
            arr[i] = sc.nextInt();
        }
        if(changeValue(arr)){
            System.out.print("increasing");
        }
        else{
            System.out.print("none");
        }
    }
    static boolean changeValue(int[] arr){
        int distance = arr[1]-arr[0];
        for(int i=1; i<arr.length; i++){
            if(Math.abs(arr[i]-arr[i-1])!=distance || (arr[i]<=arr[i-1])) return false;
        }
        return true;
    }