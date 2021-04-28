/* Assignment 14.
 * Take a number (minimum 5 digits) as input from user. Add the numbers and get the digit sum.
 * Join the sum of 2nd digit and 2nd last digit of the number with the digit sum, then join the sum
 * of 3rd digit and 3rd last digit and so on. In case of odd number of digits, add the unpaired
 * digit at the end.
 * If input : 5636789 ; Output will be : 441414106
 */
import java.util.Scanner; // to use Scanner class of java.util package to take input
class NumOps{
    void accept(){
        // This method takes the required input from the user
        Scanner no = new Scanner(System.in); // Scanner class object creation
        int num; // to store the number
        do{
            System.out.println("Please enter a number with at least 5 digits"); // asks user to enter a number
            num = no.nextInt(); // user enters a number
        }while(num<10000); // to check if the number has less than 5 digits
        updateNo(num); // call by value
    }
    void updateNo(int n){
        // This method updates the number using the logic mentioned above
        String s = ""; // to store new number
        int[] ar = new int[1+(int)Math.log10(n)]; // to access each digit of the number as an array element
        int c = n; // copy variable for n
        for(int i = ar.length - 1; c > 0; i--){
            int dg = c % 10; // to store each digit one by one
            ar[i] = dg; // to store the digit as an element in the array
            c = c / 10; // to shorten the number to access the next digit
        }
        int ds = 0; // to store digit sum
        for(int i = 0; i < ar.length; i++)
          ds = ds + ar[i]; // adding all digits together
        s = s + ds; // joining the digit sum to the string
        for(int i = 0; i < ar.length/2; i++){
            int sum = ar[i] + ar[ar.length-1-i]; // to store the sum of nth digit and nth last digit
            s = s + sum; // joining the digit sum to the updated number
        }
        if(ar.length % 2 == 1) // to check if there are an odd number of digits in the number
          s = s + ar[ar.length/2]; // to join the unpaired digit to the updated number
        System.out.println("Original Number: " + n); // printing original number
        System.out.println("Updated Number: " + s); // printing updated number
    }
}