import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        while(true){
            System.out.println("1. please enter 1 for Addition.");
            System.out.println("2. please enter 2 for Subtraction.");
            System.out.println("3. please enter 3 for Multiplication.");
            System.out.println("4. please enter 4 for Division.");
            System.out.println("5. please enter 5 for termination.");
            System.out.print("Input: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch(option) {
                case 1: {
                    System.out.print("Please enter first number for sum : ");
                    double num1 = sc.nextDouble();
                    System.out.print("Please enter second number for sum : ");
                    double num2 = sc.nextDouble();
                    System.out.println("Addition");
                    double ans = calculator.add(num1,num2);
                    System.out.println("Summation of "+num1+" and "+num2+" is: "+ans);
                    break;
                }

                case 2: {
                    System.out.print("Please enter first number for subtraction : ");
                    double num1 = sc.nextDouble();
                    System.out.print("Please enter second number for subtraction : ");
                    double num2 = sc.nextDouble();
                    System.out.println("Subtraction");
                    double ans = calculator.subtract(num1,num2);
                    System.out.println("Subtraction of "+num1+" and "+num2+" is: "+ans);
                    break;
                }

                case 3: {
                    System.out.print("Please enter first number for multiplication : ");
                    double num1 = sc.nextDouble();
                    System.out.print("Please enter second number for multiplication : ");
                    double num2 = sc.nextDouble();
                    System.out.println("Multiplication");
                    double ans = calculator.multiply(num1,num2);
                    System.out.println("Multiplication of "+num1+" and "+num2+" is: "+ans);
                    break;
                }

                case 4: {
                    System.out.print("Please enter first number for division : ");
                    double num1 = sc.nextDouble();
                    System.out.print("Please enter second number for division : ");
                    double num2 = sc.nextDouble();
                    System.out.println("Division");
                    double ans = calculator.divide(num1,num2);
                    System.out.println("Division of "+num1+" and "+num2+" is: "+ans);
                    break;
                }

                case 5: {
                    System.out.println("Exiting...");
                    return;
                }

                default: {
                    System.out.println("Error: Please Enter Valid Input");
                    break;
                }
            }
        }
//        System.out.println("Addition = "+calculator.add());
//        System.out.println("Subtraction = "+calculator.subtract());
//        System.out.println("Multiplication = "+calculator.multiply());
//        System.out.println("Division = "+calculator.divide());


    }
}