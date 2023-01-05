
import java.util.Scanner;

public class Question3 {
    Scanner read = new Scanner(System.in);

    public void function(){
        System.out.println("Please enter first number :");
        int firstNumber = read.nextInt();
        System.out.println("Please enter second number :");
        int secondNumber = read.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("Large number is : "+firstNumber);
            System.out.println("Small number is : "+secondNumber);
        }else if(secondNumber > firstNumber){
            System.out.println("Large number is : "+secondNumber);
            System.out.println("Small number is : "+firstNumber);
        }else{
            System.out.println("Numbers are equal.");
        }

    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        question3.function();
    }
}
