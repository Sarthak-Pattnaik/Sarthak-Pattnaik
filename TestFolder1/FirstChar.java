// Accept a word and print first character of the word
import java.util.Scanner;
class FirstChar{
void input(){
System.out.println("Enter a word");
String word = new Scanner(System.in).next();
print();
}
void print(){
System.out.println("First character of the word is " + word.charAt(0));
}
public static void main(String[] args){
new FirstChar().input();
}
}
