import java.util.Scanner;

public class Question6 {

    Scanner read = new Scanner(System.in);

    public void function() {
        System.out.println("Please enter 3 digit number :");
        int number = read.nextInt();
        int thirdDigit = number / 100;
        int secondDigit = (number - (thirdDigit * 100)) / 10;
        int firstDigit = (number - (thirdDigit * 100) - 10) - 10;
        int[] arr = {firstDigit,secondDigit,thirdDigit};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        question6.function();
    }
}