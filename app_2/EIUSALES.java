// Thưởng theo doanh số

package app_2;
import java.util.*;
public class EIUSALES {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int doanhso = sc.nextInt();
        int[] bac = {20,50,200,500,2000,Integer.MAX_VALUE};
        double[] thuong = {0.02,0.03,0.04,0.05,0.06,0.07};
        int sum = 0;
        double result=0;
        for(int i = 0; i< bac.length; i++){
            if(doanhso >= bac[i]){
                result+=(bac[i]-sum)*thuong[i];
            }   
            else{
                result+=(doanhso-sum)*thuong[i];
                break;
            }
            sum=bac[i];
        }
        System.out.printf("%.3f",result);
    }
}
/*Cách làm bài: tạo 2 mảng chứa các giá trị là các mốc thay đổi của bậc và thưởng nếu chạm mốc nào 
thì tính tiền thưởng mốc đó theo quy Sum of Product (SOP).
** Lưu ý: nhớ break vòng lặp khi giá trị bé hơn mốc đầu tiên xuất hiện
*Chú thích: 
    doanhso: là phần doanh số được nhập từ bàn phím
    bac: là mốc bậc doanh số đạt được 
    thuong: là phần trăm thưởng của các mốc đó
    sum: biến giả để giữ giá trị trước
    result: là kết quả cuối cùng mình nhận được
 */