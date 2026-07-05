// Building Pyramid

package app_1;
import java.util.*;
public class EIUCUBES {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       int bricks = sc.nextInt();
       int layers=0;
       int sum1=0;
       int sum2=0;
       for(int i=1; i<=bricks; i++){
        sum1+=i;
        sum2+=sum1;
        if(sum2<=bricks)
            layers++;
        else
            break;
       }
       System.out.print(layers);
    }
}
/*cách làm bài: nhìn tổng quát ta thấy rằng nó thuộc dạng nếu n=4 thì 1+(1+2)+(1+2+3)+(1+2+3+4)
vậy thì tạo 2 biến 1 biến giữ các giá trị tăng dần và 1 biến cộng hết các giá trị đó lại nếu nó lớn hơn
số gạch nhập vào, thì break vòng lặp luôn.
Chú thích:
    bricks: số gạch nhập vào
    layers: số lớp và cũng là kết quả cần tìm
    sum1: lưu giữ giá trị tăng dần 
    sum2: lưu giữ toàn bộ các giá trị tăng
 */
