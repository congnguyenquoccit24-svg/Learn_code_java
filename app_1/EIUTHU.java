// letter

package app_1;
import java.util.*;
public class EIUTHU{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int maxOver = Math.min(line1.length(), line2.length());
        int index=0;
        String result1=null;
        String result2=null;
        for(int i=maxOver; i>0; i--){
            result1 =line1.substring(line1.length()-i);
            result2 =line2.substring(0,i);
            if(line1.substring(line1.length()-i).equals(line2.substring(0,i))){
                index=i;
                break;
            }
        }
        //System.out.println(line1.substring(maxOver));
        System.out.print(line1.length()+line2.length()-index);
    }
}
/* cách làm bài: đi tìm sự giống nhau lớn nhất mà 2 đoạn thư có thể giống bằng cách so sánh độ dài của 2 
dòng, sau đó dùng substring de so sánh giảm dan các đoạn. Vì đoạn cuối của line1 giống với đoạn đầu của
line2 nên mình cho line 1 chạy từ vị trí line1.length()-maxOver, khi maxOver giảm dần thì sự so sánh
của line1 sẽ tuột dần về cuối còn line2 thì chạy dần về đầu.
* Lưu ý: dùng .equals để so sánh 2 String và nếu nó đúng thì nhớ index của nó và break vòng lặp
Chú thích:
    line1: dòng thư thứ nhất
    line2: dòng thư thứ hai 
    maxOver: là sự giống nhau tối đa giữa 2 dòng thư có thể có
    result1: dùng để check xem khi debug các kết quả so sánh hiện lên như nào ở dòng 1
    result2: dùng để check xem khi debug các kết quá so sánh hiện lên như nào ở dòng 2
    index: ghi lại vị trí mà 2 đoạn code bắt đầu giống nhau cho tới cuối.
 */