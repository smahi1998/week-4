// Author: Shubham Mahi

import java.util.Scanner;
public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }
    // Default constructor

    // adding number
    public void add(int number){
        result += number;
    }
    // substracting number
    public void substract(int number){
        result -= number;
    }

    // multiplying number
    public void multiply(int number1, int number2){
        result = number1 * number2;
    }

    // dividing number
    public void divide(int number1 , int number2){
        result = number1 / number2 ;
    }



    public int getResult() {
        return result;
    } // getting result



    public static void main(String[] args) {

        //System.in is a standard input stream
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        // getiing number 1 from user
        int num1= scan.nextInt();
        System.out.println("Enter the second number:");
        // getiing number 2 from user
        int num2= scan.nextInt();

        // printing the author name in the output
        System.out.print("Name : Shubham Mahi");
        // instantiate an object calculator
        Calculator calculator = new Calculator();
// passing num1 in the java add function
         calculator.add(num1);
        // display the result add
        System.out.print("\nThe result of calculator is " +calculator.getResult());
// passing num1 in the java substract function

        calculator.substract(num2);
        // display the result substract
        System.out.print("\nThe result of calculator is " +calculator.getResult());
       // passing num1 and num2 in the java multiply function
        calculator.multiply(num1,num2);
        // display the result for multiply
        System.out.print("\nThe result of calculator is " +calculator.getResult());
        //passing num1 and num2 in the java divide function
        calculator.divide(num2,num1);
        // display the result for divide
        System.out.print("\nThe result of calculator is " +calculator.getResult());



    }
}
