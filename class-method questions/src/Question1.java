import java.util.Scanner;

public class Question1 {
    Scanner read = new Scanner(System.in);
    int firstValue,secondValue,thirdValue;
    public void createTriangle(){
        System.out.println("Please enter first value :");
        firstValue = read.nextInt();
        System.out.println("Please enter second value :");
        secondValue = read.nextInt();
        System.out.println("Please enter third value :");
        thirdValue = read.nextInt();

        if((firstValue + secondValue) >= thirdValue){
            System.out.println("A triangle can be created from the values you enter.");
        }else{
            System.out.println("Cannot created a triangle from the values you enter.");
        }

    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        question1.createTriangle();
    }

}
