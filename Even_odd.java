import java.util.*;
public class even_odd {
    public static void main(String arg[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num= sc.nextInt();
        if(num%2==0)
        {
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The given number is odd");
        }
    }

}
