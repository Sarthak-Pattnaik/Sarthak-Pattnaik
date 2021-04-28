//check if a number is odd or even
import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String args[])
    {
        System.out.println("Let's start Visual Studio Code with a really simple program. Alright? Cool.");
        System.out.println("What I am gonna do is write a program to check if a number is odd or even.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Dear User, please enter a number");
        int n = kb.nextInt();
        if(n%2==0)
        System.out.println(n + " is even");
        else
        System.out.println(n + " is odd");
        System.out.println("Thanks a lot. Bye bye!");
    }
}