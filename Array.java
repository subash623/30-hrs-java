import java.util.Scanner;
public class Array
{
    public static void main(String[]args)
    {
        int num[];
        num=new int[100];
        System.out.println("Storing number from 1 to 100");
        for(int i=0; i<100;i++)
        {
            num[i]=i+1;
          }
        System.out.println("Following are the data");
        for(int i=0;i<100;i++)
        {
            System.out.print(num[i]);
       if(i==49)
        {
        System.out.print("\n");
         //or System.out.println();
        
   }
}
    }
}    