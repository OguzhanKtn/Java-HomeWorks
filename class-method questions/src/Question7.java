import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    Scanner read = new Scanner(System.in);
    int positive = 0;
    int negative = 0;
    int even = 0;
    int odd = 0;
    int total = 0;
    double average;
    public void report(){
        System.out.println("Please enter a number :");
        int n = read.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = read.nextInt();
        }
        for (int item:arr ) {
            total += item;
            if (item > 0) {
                positive++;
            } else if (item < 0) {
                negative++;
            }
            if (item % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        average = total / arr.length;
       Arrays.sort(arr);
        System.out.println("Positive numbers : "+positive);
        System.out.println("Negative numbers : "+negative);
        System.out.println("Largest number is : "+arr[arr.length-1]);
        System.out.println("Smallest number is : "+arr[0]);
        System.out.println("Even numbers : "+even);
        System.out.println("Odd numbers : "+odd);
        System.out.println("Total : "+total);
        System.out.println("Average is : "+average);
    }

    public static void main(String[] args) {
        Question7 question7 = new Question7();
        question7.report();
    }
}
