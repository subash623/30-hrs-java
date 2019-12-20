import java.util.Scanner;
public class mathematical
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
       int age=sc.nextInt();
       if(age>=20)
       {
           System.out.println("voter");
        }
        else
        {
            System.out.println("Non-voter");
        }
    }
}
    
