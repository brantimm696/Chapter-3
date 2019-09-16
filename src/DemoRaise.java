import java.util.Scanner;

public class DemoRaise
{
    public static void main(String[] args)
    {
    double salary = 200.00;
        Scanner input = new Scanner(System.in);
    System.out.println("Demonstrating some raises: ");
     input.nextInt();
    salary =input.nextDouble();

    }
    public static void PredictRaise(double salary)
    {
    double NewSalary;
    final double RAISE_RATE = 1.10;
    NewSalary = salary * RAISE_RATE;

    System.out.println(" Current salary: " + salary + "\nafter: " + NewSalary);
    }
}