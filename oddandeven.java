import java.util.Scanner;
public class oddandeven
{
    public static void main(String[]args)
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
       
      {
        if(i%2==0)
        {
            System.out.println("given number is even  "+ i);
            }
            else{
                System.out.println("given number is odd "+i);
            }
          
        }
    }
}
    