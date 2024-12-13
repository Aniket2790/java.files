import java.util.*;
class swap{
    public static void main(String[]k)
    {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=s.nextInt();
        System.out.println("Enter the value of y:");
        int y= s.nextInt();
        int temp;
         temp=x;
         x=y;
         y = temp;
         

         System.out.println("After Swaping:"+x +" "+y);


    }
}