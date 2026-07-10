// Tính phí ngân hàng

package app_2;
import java.util.*;
public class EIBANKFEE {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double money = sc.nextDouble();
        double quatity = sc.nextDouble();
        int[] arr = {-1,499,1999,4999};
        double[] payMonth = {12,7.5,5,0};
        double[] feeCheck = {0.2,0.2,0.1,0};
        double payment=0;
        for(int i=3; i>=0; i--){
            if(money>arr[i]){
                payment = payMonth[i]+(quatity*feeCheck[i]);
                //System.out.println
                break;
            }
        }
        System.out.print(payment);
    }
}
/*Cách làm bài: tính phí ngân hàng này là việc tính số tiền mà khách hàng phải trả, nó bằng việc
so sánh xem số tiền trong tài khoản đạt mốc nào để tính tiền tháng cho khách hàng đó, cách tính như sau
payment = số tiền phải trả hàng tháng + (số lượng tiền * phí mỗi lần check);
*Chú thích:
    money: số tiền nhập vào
    quatity: sô lượng tờ tiền
    arr: các mốc tiền sẽ nhận được các phí tiền khác nhau
    payMonth: phí tiền mỗi tháng phải trả
    feeCheck: là số tiền mỗi lần check
    payment: là kết quả tiền mình phải trả
 */