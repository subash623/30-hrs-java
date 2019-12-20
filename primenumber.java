import java.util.Scanner;
public class primenumber
{
    public static void main(String[]args)
    {
        int temp,i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        temp=num; 
        for(i=2;i<=num;i++){
            if(temp%i==0) break;

    }
    {
    if(num==i)
    System.out.println(num+"is a prime");
    else
    System.out.println(num+"is not prime");
    c++;
   
    
    
}
System.out.println("total"+c);
}
}
 

        