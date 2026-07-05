package app_1;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int arraySize = scanner.nextInt();


        int[] numbers = new int[arraySize];


        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }


        int resultValue = numbers[0];
        int highestCount = 1;


        int checkingValue = 0;


        for (int i = 1; i < arraySize; i++) {
            checkingValue = numbers[i];


            int occurrenceCount = 0;


            for (int j = 0; j < arraySize; j++) {
                if (numbers[j] == checkingValue) {
                    occurrenceCount++;
                }
            }


            if (occurrenceCount > highestCount) {
                resultValue = checkingValue; 
                highestCount = occurrenceCount;
            }
            else if(occurrenceCount==highestCount && checkingValue<=resultValue){
                resultValue = checkingValue; 
                highestCount = occurrenceCount;
            }
        }


        System.out.println(highestCount + " occurs for value " +resultValue);
    }
}
