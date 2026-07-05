// Quà sinh nhật

package app_2;
import java.util.*;
public class EIUBIRTH {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(repeat!=0){
            long blue = sc.nextLong();
            long red = sc.nextLong();
            long moBlue = sc.nextLong();
            long moRed = sc.nextLong();
            long swap = sc.nextLong();
            sb.append(cheapValue(blue,red,moBlue,moRed,swap)).append("\n");
            repeat--;
        }
        System.out.print(sb);
    }
    static long cheapValue(long b, long r, long mB, long mR, long s){
        if(mB+s<mR){
            return (b+r)*mB+(r*s);
        }
        else if(mR+s<mB){
            return (b+r)*mR+(b*s);
        }
        return (b*mB)+(r*mR);
    }
}
/*cách làm: để tìm được giá tiền nhỏ nhất cho mỗi món quà t cần phải tình các trường hợp như giá của món
khác + swap có bé hơn giá mua gốc của món đó không. Sẽ có các trường hợp như:
    + Nếu giá mua của món đầu + swap bé hơn giá gốc của món sau 
    ==> (sl món đầu + sl món sau)* giá món đầu + (sl món sau * swap) **(sử dụng cách hoàn tiền mua món khác để giảm tiền)
    + nếu giá mua món sau + swap bé hơn giá gốc của món đầu
    ==> (sl món đầu + sl món sau)* giá món sau + (sl món đầu * swap)
    + các trường hợp còn lại sẽ là giá của 2 món bằng nhau hoặc giá của mỗi món khi cộng vs swap đều lớn
    hơn giá của thứ còn lại.
    ==> (sl món đầu * giá của nó) + (sl món sau * giá của nó).
Chú thích:
    repeat: là số testcase
    blue: số lượng món hàng màu xanh
    red: số lượng món hàng màu đỏ
    moBlue: giá tiền món hàng màu xanh
    moRed: giá tiền món hàng màu đỏ
    swap: giá tiền khi hoán đổi từ món này sang món kia
 */
