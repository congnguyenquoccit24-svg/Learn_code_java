// Giảm giá tết

package app_2;
import java.util.*;
public class EIUDISCOUNT3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        long money = sc.nextLong();
        int online = sc.nextInt();
        int vip = sc.nextInt();
        int card = sc.nextInt();
        double[] discount = {1,0.97,0.95,0.93,0.9,0.88,0.85,0.85};
        long[] moneyPoint = {5000000,20000000,100000000,300000000,600000000,900000000,Long.MAX_VALUE};
        long sum=0;
        long moneyPay = 0;
        for(int i=0; i<moneyPoint.length ; i++){
            if(money>moneyPoint[i]){
                moneyPay += (moneyPoint[i]-sum)*discount[i];
            }
            else{
                moneyPay += (money-sum)*discount[i];
                break;
            }
            sum = moneyPoint[i];
        }
        //System.out.println(moneyPay);
        for(int i=0; i<(online+vip+card); i++){
            moneyPay*=0.98;
        }
        System.out.print(moneyPay);
    }
}
/*Cách làm bài: đầu tiền ta phải tính tiền giảm giá tết trước trong bài EIDISCOUNT2, tóm tắt cơ bản
là khi đạt mốc tiền nào thì nhận được giá trị giảm giá như thế, (lũy tiến), sau đó dùng vòng for để
đếm xem mình sẽ nhận được bao nhiêu lần giảm giá của online, vip, card để * với 0.98.
** Lưu ý: nhớ break vòng lặp để tránh sai kết quả
* Chú thích:
    money: là số tiền nhập vào từ bàn phím
    online: nhận giá trị 0 hoặc 1 để biết có giảm giá 2% hay không
    vip: nhận giá trị 0 hoặc 1 để biết có giảm giá 2% hay không
    card: nhận giá trị 0 hoặc 1 để biết có giảm giá 2% hay không
    discount: mảng nhận giá trị giảm giá lúc tết
    moneyPoint: mảng nhận giá trị mốc tiền lúc tết
    sum: là biến giữ mốc tiền quá khứ
    moneyPay: là số tiền cuối cùng phải trả
 */
