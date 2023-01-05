
import java.util.Scanner;

public class Question5 {
    Scanner read = new Scanner(System.in);

    public void sum(){
        System.out.println("Please enter a 3 digit number :");
        int number = read.nextInt();
        int thirdDigit = number / 100;
        int number2 = number - (thirdDigit * 100);
        int secondDigit = number2 / 10;
        int number3 = number2 - (secondDigit * 10);
        int firstDigit = number3;
        System.out.println(thirdDigit + secondDigit + firstDigit);

    }

    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.sum();
    }
}
