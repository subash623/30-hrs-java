import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("press '+' for add, '-' for Sub, '*' for Mul, '/' for div");
        char input=sc.next().charAt(0);
        System.out.println("Please enter a two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (input)
        {
            
            case '+':
            int add=a+b;
            System.out.println(add);
            break;
           case '-':
            int sub=a-b;
            System.out.println(sub);
            break;
           case '*':
           int mul=a*b;
           System.out.println(mul);
            break;
          case '/':
          int div=a/b;
            System.out.println(div);
            break;
            default:
            System.out.println("Please enter a valid symbol");
            break;
        }
    }
}


            
       