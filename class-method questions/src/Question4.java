import java.util.Scanner;

public class Question4 {
    Scanner read = new Scanner(System.in);

    public void sum(){
        System.out.println("Please enter a number :");
        int n = read.nextInt();
        double total = (n * (n+1)) / 2;
        System.out.println(total);
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        question4.sum();
    }
}
