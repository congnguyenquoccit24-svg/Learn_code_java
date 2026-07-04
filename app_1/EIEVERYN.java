// Every Number

package app_1;
import java.util.*;
public class EIEVERYN {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int repeat = sc.nextInt();
        if(repeat>=1 && repeat<=20){
            while(repeat>0){
                int firstNum = sc.nextInt();
                if(firstNum<1) break;
                int secondNum = sc.nextInt();
                int[] arr = new int[firstNum];
                for(int i=0; i<firstNum; i++){
                    arr[i] = sc.nextInt();
                }
                if(checkValue(firstNum,secondNum,arr))
                    System.out.println("Yes");
                else
                    System.out.println("No");
                repeat--;
            }
        }
    }
    static boolean checkValue(int fNum, int sNum, int[] arr){
        if(fNum<sNum) return false;
        boolean[] checkArr = new boolean[sNum+1];
        checkArr[0] = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=sNum) checkArr[arr[i]]=true;
        }
        for(int i=1; i<sNum+1; i++){
            if(checkArr[i]==false) return false;
        }
        return true;
    }
}
/* cách làm bài này: 
    ta sử dụng hàm while để có thể tạo testcase liên tục. Sau đó dùng hàm kiểm tra để check xem nó sẽ
    trả về gtri gì. 
    trong hàm checkValue: tạo 1 mảng boolean để check từng gtri trong đó. Nếu gtri trong arr nhỏ hơn 
    gtri secondNum thì gán gtri của boolen tương ứng là true.
    * chú ý: t phải gán gtri trước cho gtri 0 là true để tránh lỗi trả về full false. 
    chú thích:
    repeat: là số testcase
    firstNum: là số lượng phần tử trong arr
    secondNum: là chặn để tìm các gtri dưới nó có trong mảng chưa
    arr: mảng chứa gtri có độ dài firstNum
    fNum: biến nhận gtri của firstNum
    sNum: biến nhận gtri cua secondNum
    checkArr: mảng boolean dùng để check gtri trong mảng arr
 */
