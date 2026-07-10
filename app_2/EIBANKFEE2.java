// Tính phí ngân hàng

package app_2;
import java.util.*;
public class EIBANKFEE2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        double[] money = new double[repeat];
        double[] quatity = new double[repeat];
        double result=0;
        double sumOfQuatity=0;
        for(int i=0; i<repeat; i++){
            money[i] = sc.nextDouble();
            quatity[i] = sc.nextDouble();
            sumOfQuatity+=quatity[i];
            result+=feePerTime(money[i], quatity[i]);
        }
        result/=sumOfQuatity;
        System.out.printf("%.3f", result);
    }
    static double feePerTime(double money, double quatity){
        int[] redundant = {-1,499,1999,4999};
        double[] feeMonth = {12,7.5,5,0};
        double[] feeCheck = {0.2,0.2,0.1,0};
        double result=0;
        for(int i=3; i>=0; i--){
            if(money>redundant[i]){
                result = feeMonth[i]+(quatity*feeCheck[i]);
                break;
            }
        }
        return result;
    }
}
/*Cách làm bài: tương tự như bài EIBANKFEE, tuy nhiên ta cần tình xem tổng của các tờ tiền và tổng của
các phí cần trả của mỗi loại tiền. Sau đó tính trung bình sẽ ra được kết quả là số tiền phải trả cho 
mỗi tờ.
* Chú thích:
    repeat: là độ dài của mảng
    money: là mảng chứa các tờ tiền
    quatity: là số tờ tiền của mỗi loại tiền
    result: là kết quả nhận được
    sumOfQuatity: là tổng số lượng các tờ tiền
    redundant: là các mốc tiền để có thể dùng các số lượng tiền phải trả 
    feeMonth: là mảng chứa các mốc tiền phải trả cho mỗi tháng 
    feeCheck: là mảng chứa các mốc tiền phải trả cho mỗi lần check
    result(): lần nữa xuất hiện trong mảng là nơi chứa tiền phải trả co từng đơn vị tiền
 */
