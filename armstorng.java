
//armstorng
import java.util.Scanner;
public class armstorng
{
    public static void main (String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check armstorng");
        int num=input.nextInt();
       int a,count=0, ori_num=num;
        int number=num;
        double sum=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        while(number>0)
        {
            a=number%10;
            sum=sum+Math.pow(a,count);
            number=number/10;
        }
        if(sum==ori_num)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
        System.out.println("Given number is not a armstrong");
    }
}
}

    

 