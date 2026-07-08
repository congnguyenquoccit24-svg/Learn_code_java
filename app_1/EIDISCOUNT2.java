// Chiết Khấu

package app_1;
import java.util.*;
public class EIDISCOUNT2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long money = sc.nextLong();
        double[] discount = {1,0.97,0.95,0.93,0.9,0.88,0.85,0.85};
        long[] moneyPoint = {5000000,20000000,100000000,300000000,600000000,900000000,Long.MAX_VALUE};
        long sum=0;
        long result=0;
        for(int i=0; i<moneyPoint.length; i++){

            if(money>moneyPoint[i]){
                result += (moneyPoint[i]-sum)*discount[i];
            }
            else{
                long a = money -sum;
                result += (a)*discount[i];
                break;
            }
            sum=moneyPoint[i];
        }
        System.out.println(result);
    }
}
/*Cách làm bài: tương tự bài discount, tạo 2 mảng ( 1 mảng discount, 1 mảng chứa các mốc tiền) sau đó
phân trường hợp nếu nó lớn hơn (dựa vào đề để xác định) thì mình lấy mốc trước trừ mốc sau rồi nhân
discount[i] tương ứng. Nếu nó bé hơn thì lấy số tiền đó trừ mốc trước rồi nhân discount[i] vì nó vẫn
phù hợp để nhận tiền.
** Lưu ý: nếu nó bé hơn hoặc bằng thì phải tính 1 lần và break vòng lặp để tránh sai kết quả.
*Chú thích: 
    money: số tiền nhập vào
    discount: mảng chứa các mốc giảm giá
    moneyPoint: mảng chứa các mốc tiền
    sum: là biến chứa các mốc cũ
    result: kết quả là số tiền mình phải trả sau khi giảm giá.
 */
