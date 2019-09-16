import java.util.Scanner;

public class PoundsConuersion
{
    public static void main(String[] args)
    {
        double pounds ;



        Scanner input = new Scanner(System.in);
        System.out.println(" enter number of pounds >>> ");
        pounds = input.nextInt();
        poundsToKilo( pounds);

    }
    public static void poundsToKilo(double pounds){
          double kilo = pounds * 0.453592;

         System.out.println(" pound " + pounds + " = " + "KG " + kilo);
    }
}

