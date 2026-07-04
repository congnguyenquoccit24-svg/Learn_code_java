package app_2;
import java.util.*;
public class EIUMADIS {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        int listNum = sc.nextInt();
        long[] arr = new long[listNum];
        long max=0;
        for(int i=0; i<listNum; i++){
            arr[i]=sc.nextLong();
        }
        long min=arr[0];
        long distance=0;
        for(int i=1; i<listNum; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else{
                distance=arr[i]-min;
                if(max<distance) max=distance;
            }
        }
        System.out.print(max);
    }
}
/* cách làm: gán giá trị đầu tiên là min, xét các số tiếp theo:
    +nếu nó lớn hơn min thì tính distance của nó, nếu nó lớn hơn max thì gán max bằng giá trị đó
    + nếu nó nhỏ hơn thì gán min là số đó là chạy tiếp chương trình.
chú thích:
    listNum: là độ dài mảng
    arr: là mảng nhập vào tự bàn phím
    max= là số lớn nhất và cũng sẽ là kết quả cuối cùng đc in ra
    min= là giá trị nhỏ nhất trong bài và sẽ thay đổi theo số lần xét
    distance: là khoảng cách từng số trong mảng được ghi lại
 */
