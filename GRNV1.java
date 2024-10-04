import java.util.Random;
import java.util.Scanner;
//GRN: Guess Random Number
//This project is used to find or guess the random number generated(1-100). We will generate the random number using
// random function and will ask the user to guess the random number. We will take the input from the user untill the user's
//input is equal to the random number.
public class GRNV1 {
    void guess()
    {
        int random_number=0, min=1, max=100, input_number=0, count=0;
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        random_number=rand.nextInt((max-min+1)+min);
        do {
            System.out.println("Enter the number to be guessed(1 to 100): ");
            input_number=sc.nextInt();
            if(input_number==random_number) {
                System.out.println("Congrats, You have guessed the number correctly which is " + random_number + ".");
                break;
            }
            else if (input_number>random_number) {
                System.out.println("Your guess is larger than the number. Enter Smaller value");
            }
            else if(input_number<random_number)
                System.out.println("Your guess is smaller than the number. Enter larger value");
        }while(true);
    }
    public static void main(String[] args)
    {
        GRNV1 obj = new GRNV1();
        obj.guess();
    }
}
