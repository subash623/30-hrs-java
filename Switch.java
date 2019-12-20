import java.util.Scanner;
public class Switch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1 for coke.\n 2 for pepsi.\n 3 for Dew.\n 4 for Fanta.\n ");
                int input = sc.nextInt();
              
		switch(input)
		{
			case 1:
			System.out.println("coke");
			break;
			case 2:
			System.out.println("Pepsi");
			break;
			case 3:
			System.out.println("Dew");
			break;
			case 4:
			System.out.println("Fanta");
			break;

			default:
			System.out.println("Please enter a valid number");
		    break;

		  }


	}
	
}