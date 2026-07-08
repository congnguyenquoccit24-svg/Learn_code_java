//Christmas discount

package app_1;
import java.util.*;
public class EIUCHRMS {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        long[] arr = new long[repeat];
        long sum=0;
        for(int i=0; i<repeat; i++){
            arr[i] = sc.nextLong();
            sum+=priceEachItem(arr[i]);
        }
        System.out.println(sum);
    }
    static double priceEachItem(long money){
        double[] discount = {0.96,0.95,0.94,0.93,0.92,0.91,0.9,0.9};
        long[] pricePoint = {2000000,5000000,10000000,20000000,50000000,100000000,200000000,Long.MAX_VALUE};
        for(int i=pricePoint.length-1; i>=0; i--){
            if(money>pricePoint[i]){
                return (money*discount[i]);
            }
        }
        return (money*0.97);
    }
}
/*Cách làm bài: Đây không phải là mốc bài lũy tiến nên cứ nhân khi nó đạt ở 1 vị trí mốc tiền nào đó
như tính điểm thông thường, trước hết tạo 1 mảng chứa các giá trị là các bills tiền, sau đó lấy từng
số tiền phải trả trong đó ra nhân với từng mốc. Vd: nếu có 500000000 thì đem nhân với 0.92.
** Lưu ý: đây không phải bài lũy tiến, chỉ cần nhân thông thường là được.
* Chú thích: 
    repeat: chiều dài mảng
    arr: mảng chứa các bills tiền
    sum: là biến chứ số tiền tổng cuối cùng
    discount: là mảng chứa các mốc giảm giá
    pricePoint: là mảng chứa các mốc tiền có thể dùng để giảm giá
    priceEachItem: là hàm dùng để tính từng số tiền của món hàng
 */