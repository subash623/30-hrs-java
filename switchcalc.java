import java.util.Scanner;
public class switchcalc
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Scond number");
        int b=sc.nextInt();
        int result=0;
        char operation=sc.next().charAt(0);
        switch(operation)
        {
            case'+':
            result=a+b;
            break;
         case'-':
          result=a-b;
          break;
          case'*':
          result=a*b;
          break;
          case'/':
          result=a/b;
          break;
        }
       System.out.println(result);
        
         
    }
}     
   
    