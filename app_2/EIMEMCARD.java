// Member Card

package app_2;
import java.util.*;
public class EIMEMCARD {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        long[] arr = new long[repeat];
        for(int i=0; i<repeat; i++){
            arr[i] = sc.nextLong();
        }
        int[] memPoint = {1000000,20000000,50000000,200000000};
        double[] discount = {0.02,0.03,0.05,0.07};
        double result=0;
        double sales = 0;
        long iniMoney=0;
        for(int i=0; i<repeat; i++){
            iniMoney+=arr[i];
            for(int j=memPoint.length-1; j>=0; j--){
                if(iniMoney>=memPoint[j]){
                    result = (sales * arr[i]);
                    sales = discount[j];
                    break;
                }
                else{
                    result = (arr[i]*sales);
                }
            }
            System.out.print(result + " ");
        }
    }
}
/*Cách làm bài: tạo 2 mảng chứa các giá trị là các mốc tiền và discount của nó và lấy ra trong mảng
nhập vào từng số  để in ra số tiền cần thiết. Cách hoạt động là nếu số tiền đầu tiên lớn hơn mốc nào
thì lần mua sau sẽ nhần được discount đó. Và tổng các lần trước và lần này ta so sánh mà vượt mốc nào
thì tiếp tục nhân discount tương ứng. 
Vd: nếu như testcase là:
5
500000 2000000 6000000 50000000 3000000
thì discount của mốc 500000 luôn là 0 vì nó là số tiền đầu tiên mua nên chưa ghi lại
sau đó 2000000+500000 mà đạt mốc tiếp theo thì số tiền tiếp theo sẽ nhận đc discount tương ứng 
liên tục như vậy kiểu gì cuối cùng cũng sẽ dư ra 1 vé discount chưa đc sài
*Chú thích: 
    repeat: là độ dài của mảng 
    arr: là mảng chưa các số tiền nhập vào
    memPoint: mốc tiền để nhận các phần giảm giá
    discount: là các mốc giảm giá
    result: là kết quả cuối cùng nhận được
    sales: là biến tạm dùng để lưu giá trị của các mốc giảm giá đã nhận 
    iniMoney: là biến dùng để cộng các mốc tiền và đem đi so sánh
 */