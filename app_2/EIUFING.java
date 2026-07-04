// count fingers

package app_2;
import java.util.*;
public class EIUFING {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int num = sc.nextInt();
        String[] arr = {"cai","tro","giua","ap ut","ut","ut","ap ut","giua","tro","cai","tro","giua","ap ut","ut","ut","ap ut","giua","tro"};
        String[] place={"trai","trai","trai","trai","trai","phai","phai","phai","phai","phai","phai","phai","phai","phai","trai","trai","trai","trai"};
        if(num<=18){
            System.out.print("Ngon "+arr[num-1]+" cua ban tay "+place[num-1]);
        }
        else{
            int value =(int) Math.ceil((num-18)/(double) 18);
            num=num-(value*18);
            System.out.print("Ngon "+arr[num-1]+" cua ban tay "+place[num-1]);
        }
    }
}
/* đây là một vòng lặp 18 đơn vị, nếu bạn để ý bạn sẽ thấy rằng sau khi đi hết 1 vòng nó sẽ dừng lại ở
số 18 vì thế tạo 2 mảng, 1 mảng là tên các ngón tay và 1 mảng là vị trí trái phải của chúng.
cách làm: 
    + chúng ta trừ đi 18 đơn vị nếu số nhập vào bé hơn 18
    + nếu lớn hơn 18 thì thực hiện phép chia để lấy số lần lặp rồi lấy só nhập vào ban đầu -(số lần lặp*18)
    nó sẽ ra được 1 số nằm trong khoảng 1-18, in nó ra với vị trí -1.
chú thích:
    num: số nhập vào
    arr: là mảng tên ngón tay
    place: và vị trí trái phải của các ngonns tay tương ứng
    value: là số lần lặp
*/ 
