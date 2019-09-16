package assinments;

import java.util.Scanner;

public class PaintCalculator
{
    public static void main(String[] args)
    {
        //assined variables
        int L;
        int H;
        int W;


    //get input
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of walls >>> ");
        L = input.nextInt();
        System.out.println("enter the height of walls >>> " );
        H = input.nextInt();
        System.out.println("Enter the width of room >>> ");
        W =input.nextInt();

    PaintMath(L,H,W);
    }
    public static void PaintMath(int L,int H,int W){

      int totalSQ;
        totalSQ =  (H * W) * 2 + (H*L)*2;
        System.out.println("total SQ is " + totalSQ);

        gallons(totalSQ);

    }
    public static void gallons (int SQ){

        int price =32;


        int totalPrice = SQ/350 * price;
        System.out.println("total price is $" + totalPrice);
    }
}
