import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
        System.out.println ("Hello World!");
        // declare an integer variable called num and
        // assigned it a start value of 0
        int num = 0;
        /* multi line comment
        .
        .
        .
         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = keyboard.nextInt ();
        System.out.println(num);
    }
}
