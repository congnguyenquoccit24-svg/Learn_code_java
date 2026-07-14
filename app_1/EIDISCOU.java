// Discount

package app_1;
import java.util.*;
public class EIDISCOU {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long money = sc.nextLong();
        double[] arr = {1,0.97,0.95,0.93,0.9,0.88,0.85,0.85};
        long[] moneyPoint = {2000000,10000000,50000000,100000000,200000000,500000000,Long.MAX_VALUE};
        long result=0;
        long sum=0;
        for(int i=0; i<moneyPoint.length; i++){
            if(money>=moneyPoint[i]){
                result+=(long)(moneyPoint[i]-sum)*arr[i];
            }
            else{
                result+=(money-sum)*arr[i];
                break;
            }
            sum=moneyPoint[i];
        }
        System.out.println(result);
    }
}
/*Cách làm bài: giống như các bài tính điểm hay discount khác, tạo 2 mảng có chứa các mốc giá trị như
discount và mốc tiền tương ứng, nếu có thể dùng hashmap thì ngon nhưng 104 không cho. Sử dụng phương pháp
nếu số tiền nhập vào lớn hơn mốc nào thì mình lấy mốc đó trừ mốc sau rồi nhân cho discount tương ứng,
tuy nhiên phải gán mốc cho sum chứ không thể dùng moneyPoint[i]-moneyPoint[i-1] được vì có thể bị lỗi
compiler (outOfBound). Trường hợp nếu nó bé hơn thì lấy số tiền đó trừ mốc sum đã gán trước đó
(là giá trị moneyPoint[i-1]) rồi nhân với discount[i] luôn vì vẫn nằm trong mốc đã nhận.
** Lưu ý: nhớ break vòng lặp nếu nó bé hơn để tránh cho ra sai kết qquả.
* Chú thích:
    money: Số tiền nhập vào
    arr: mảng discount
    moneyPoint: là mảng chứa các mốc tiền
    result: là kết quả cuối cùng số tiền mình phải trả
    sum: là biến chứa các mốc tiền cũ dùng để trừ khi số tiền nhập vào bé hơn mốc thứ i
 */

/* Cách 2: 

package app_1;
import java.util.*;
public class tesst {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long money = sc.nextLong();
        long[] moneyPoint = {0,2000000,10000000,50000000,100000000,200000000,500000000,Long.MAX_VALUE};
        double[] discount = {1,0.97,0.95,0.93,0.9,0.88,0.85};
        long pay = 0;
        for(int i=1; i<moneyPoint.length; i++){
            if(money>moneyPoint[i-1]){
                pay+=(Math.min(money,moneyPoint[i])-moneyPoint[i-1])*discount[i-1];
            }
        }
        System.out.print(pay);
    }
}
    
*/