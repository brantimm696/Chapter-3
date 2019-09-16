package assinments;

public class Percentages
{
    public static void main(String[] args)
    {
    double X =5.0;
    double Y =2.0;
    computePercent(X,Y);
    }
    public static void computePercent(double X , double Y){


          double Total = Y / X*100;
          System.out.println(Y + "is "+ Total +"% of "+ X);
    }
}
