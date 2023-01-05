import java.util.Scanner;

public class Question2 {

    Scanner read = new Scanner(System.in);

    public void converter(){
        System.out.println("1 - F -> C\n2 - C -> F\nChoice :" );
        int choice = read.nextInt();
        System.out.println("Please enter temperature :");
        double temperature = read.nextInt();

        if(choice == 1){
            double C= (temperature - 32) / 1.80;
            System.out.println(temperature +" F = "+C +" C");
        }else if(choice == 2){
            double F = (temperature / 100) * 180 + 32;
            System.out.println(temperature +" C = "+F + " F");
        }


    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        question2.converter();
    }
}
