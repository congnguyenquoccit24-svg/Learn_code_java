// Building Pyramid 2

package app_1;
import java.util.*;
public class EIUCUBES2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        long[] arr = new long[repeat];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<repeat; i++){
            arr[i]=sc.nextLong();
            sb.append(numLayers(arr[i])).append(" ");
        }
        System.out.print(sb);
    }
    static long numLayers(long bricks){
        long layers =(long) Math.cbrt(bricks*6);
        long value = 0;
        for(long i=layers-1; i<=layers+1; i++){
            if((i*(i+1)*(i+2))/6<=bricks)
                value=i;
        }
        return value;
    }
}
/*Cách làm: ta không thể làm giống dạng Building Pyramid nên ta phải suy ra công thức của nó, thứ nhất nó 
thuộc dạng   U(n+1)=Un+n+1 
        <==> U(n+1)-Un=n+1; 
    sử dụng công thức tính tổng các số tự nhiên S=(n(n+1))/2
    và nhìn vế trái ta thấy nó thuộc dạng telescoping (triệt tiêu lẫn nhau) thay từng số hạng vào ta thấy
    U2-U1+U3-U2... vậy kết quả tổng sẽ là U(n+1)-U1=(n(n+1))/2-1. Triệt tiêu -1 ở hai vế ta có:
    <==> xích ma(U(n+1))= xích ma ((n(n+1))/2)
    ==> tổng của nó sau khi tính ra sẽ là:
        S=1/2 xích ma (n(n+1))
        <==> 1/2 (xích ma (n^2)*xích ma (n))
        <==> 1/2 ((n(n+1)(2n+1))/6 + (n(n+1))/2)
        <==> 1/2 (((n^2+n)(2n+1))/6 + (3n^2+3n)/6)
        <==> (2n^3+n^2+2n^2+n+3n^2+3n)/12
        <==> (2n^3+6n^2+4n)/12  đặt nhân tử chung
        <==> (2n(n^2+3n+2))/12
        <==> (n(n^2+3n+2))/6
        <==>(n(n+1)(n+2))/6  vậy đây là công thức tổng cơ bản để tìm số gạch
    ta thấy cơ bản rằng lim(a) có thể xấp xỉ bằng lim(a+1) và cũng xấp xỉ bằng lim(a+2)
    vậy suy ra a^3/6 xấp xỉ bằng bricks suy ra Math.cbrt(bricks*6) sẽ cho ra kết quả gần chính xác nhất
    Tới đó ta chạy for xung quanh giá trị đó sẽ ra kết quả cần tìm
Chú thích: 
    repeat: số testcase
    arr: mảng chứa giá trị
    layers: kết quả trả về, nó là số lớp cần tìm
    value: là giá trị cần gán cho số lớp và cũng là kết quả đầu ra của hàm numLayers.
 */
