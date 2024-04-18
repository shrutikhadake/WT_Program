// class A.java 
package Input;

public class A {

       // System.out.println("The calculator");
        int a,b;
        public int getA()
        {
            return a;
        }
        public void setA(int a)
        {
            this.a=a;
        }
        public int getB()
        {
            return b;
        }
        public void setB(int b)
        {
            this.b=b;
        }
        public void sum(int x,int z)
        {
            int s=x+z;
            System.out.println("The sum is:"+s);
        }

}


// class B.java

import java.util.*;
import Input.A;
public class B extends  A
{
    public static void main(String arg[])
    {
        B B1=new B();
        System.out.println("Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        B1.setA(a);
        B1.setB(b);
        B1.sum(B1.getA(), B1.getB());
    }



}
