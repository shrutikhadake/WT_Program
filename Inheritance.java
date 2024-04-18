// class sum_derived
import java.util.Scanner;

public class sum_derived {
    static int a;
    static int num;
     static int sum=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        num=sc.nextInt();
    }

}


// class sum_base
package mypack;

import java.util.Scanner;

public class sum_base extends sum_derived {

    static void show()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number one by one:");
        for(int i=0;i<num;i++)
        {

            a=sc.nextInt();
            sum=sum+a;
        }
        System.out.println("The sum is :"+sum);

    }
    public static void main(String arg[])
    {
        sum_base b=new sum_base();
        b.input();
        b.show();
    }

}

// class fact_base

package mypack;
import java.util.*;
public class fact_base {

    static int num,fact=1;
    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
    }

}

//class fact_derived
package mypack;
import java.util.*;
public class fact_derived extends fact_base{
    static void show()
    {
        for(int i=1;i<=num;i++)
        {

            fact=fact*num;

        }
    }

}
