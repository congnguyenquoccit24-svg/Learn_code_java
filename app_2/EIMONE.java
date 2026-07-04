// Money change

package app_2;
import java.util.*;
public class EIMONE {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        int money = sc.nextInt();
        int[] arrMoney = {20,10,5,1};
        for(int i=0; i<4; i++){
            int value=(int) Math.floor(money/arrMoney[i]);
            if(money/arrMoney[i]>=1){
                System.out.println(arrMoney[i]+" "+value);
            }
            money-=arrMoney[i]*value;
        }
    }
     /* cho chạy một mảng có chứa các giá trị của các số có thể in ra
     nếu chia và luôn làm tròn về số nhỏ nhất mà được kết quả lớn hơn 1 thì in nó ra không thì nhảy qua 
     phần số khác.
     chú thích: 
     money: là số tiền nhập vào (input)
     arMoney: là mảng chứa các số tiền có thể in ra của đề
     value: là bao nhiêu tờ tiền được trả về sau khi chia và làm tròn xuống. vd: 30k thì trả 1 tờ 20k và 1 tờ 10k
     * lưu ý: sau khi tính xong được các tờ tiền phải trừ đi số tiền đó mới tính được tới giá trị tờ
     tiền tiếp theo.
*/
}
