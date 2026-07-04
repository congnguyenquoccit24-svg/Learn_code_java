//  Order of the sequence

package app_1;
import java.util.*;
public class EIINCRDES {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        for(int i=0; i<lengthArr; i++){
            arr[i] = sc.nextInt();
        }
        boolean isIn=false;
        boolean isDe=false;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>=arr[i-1])
                isIn=true;
            if (arr[i]<=arr[i-1])
                isDe=true;
        }
        if(isIn!= isDe && isIn==true)
            System.out.print("increasing");
        else if(isIn!=isDe && isDe==true)
            System.out.print("decreasing");
        else
            System.out.print("none");
    }
}
/* cách làm bài này:
    tạo 2 biến boolean để kiểm tra giá trị của từng mục, và tạo 2 cái if của 2 trường hợp bé hươn bằng
    thì chuyển boolean sang true, tường hợp lớn hơn bằng thì chuyển boolean sang true. 
    xét 3 trường hợp.
    + nếu 2 cái boolean khác nhau mà isIn đúng thì nó tăng
    + nếu 2 cái boolean khác nhau mà isDe đúng thì nó giảm
    + nếu 2 cái boolean giống nhau kết luận không tăng không giảm hoặc vừa tăng vừa giảm.
    * chú thích:
    lengthArr:  là độ dài mảng 
    arr: là mảng giá trị
    isIn: giá trị để test sự thay đổi tăng
    isDe: giá trị để test sự thay đổi giảm
 */
