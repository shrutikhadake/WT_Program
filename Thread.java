// class soach.java
public class soach extends Thread {
    public void run()
    {
        try
        {
            System.out.println("Hii current:::"+Thread.currentThread());
            System.out.println("Current Id:::"+Thread.currentThread().getId());
            System.out.println("Current Name:::"+Thread.currentThread().getName());
            System.out.println("current Priority:::"+Thread.currentThread().getPriority());
            System.out.println("current Group:::"+Thread.currentThread().getThreadGroup());
        }
        catch (Exception exception)
        {
            System.out.println("Durghatna"+exception);

        }finally {
            System.out.println("Totall"+Thread.activeCount());
        }
    }

}

//class Zindahunmai.java
public class Zindahunmai extends soach{
    public static void main(String arg[])
    {
        Zindahunmai zh=new Zindahunmai();
        zh.run();
    }
}


// class Dilkyakehataha.java
public class Dilkyakehatahai {
    public static void main(String arg[])
    {
        int n=8;
        for(int i=0;i<n;i++)
        {
            soach s=new soach();
            s.start();
        }
    }

}

