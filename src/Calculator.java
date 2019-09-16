import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int userEntry1;
        int userEntry2;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number >>> ");
        userEntry1 = input.nextInt();


        System.out.println("Enter number >>> ");
        userEntry2 = input.nextInt();
        calculateAddition(userEntry2, userEntry1);
        calculateSubtraction(userEntry2, userEntry1);
       calculateMultiplication(userEntry2, userEntry1);
        calculateAddition(userEntry2, userEntry1);
    }
    public static void calculateAddition(int num1, int num2){
        int total = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + total);
    }
    public static void calculateSubtraction(int num1,int num2){
        int total = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + total);
    }
    public static void calculateMultiplication(int num1, int num2){
     int total = num1 * num2;
     System.out.println(num1 + " * " + num2 + " = " + total);
    }
    public static void calculateDivistion(int num1, int num2){
        int total = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + total);
    }
    public static void calculateModulus(int num1,int num2){
        int total = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + total);
    }
}
