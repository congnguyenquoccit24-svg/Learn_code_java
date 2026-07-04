// Điểm số

package app_2;
import java.util.*;
public class EIPOINT {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int score = sc.nextInt();
        int[] numbGrade = {90,85,80,75,70,65,60,55,53,52,50,0};
        String[] letterGrade = {"A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
        for(int i=0; i<numbGrade.length; i++){
            if(score>=numbGrade[i]){
                System.out.print(letterGrade[i]);
                break;
            }
        }
    }
}
/* chú thích:
    socre: là điểm số nhập vào (intput)
    numbGrade: là bảng điểm số của đề được viết dưới dạng mảng số
    letterGrade: là bảng điểm chữ của đề được viết dưới dạng String
    * cách làm:
    chỉ cần so sánh từ cao xuống thấp nếu score cao hơn hoặc bằng thì in ra kết quả chữ rồi break vòng lặp
    * lưu ý:
    phải break vòng lặp nếu không kết quả sẽ bị in ra nhiều lần.    
*/