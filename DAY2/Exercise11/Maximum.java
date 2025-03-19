import java.util.Scanner;

class Maximum{
	public static void main(String ards[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter the first integer:");
		int num1=ob.nextInt();
		System.out.println("The First value is : "+num1);
		
		System.out.print("Enter the second integer:");
		int num2=ob.nextInt();
		System.out.println("The Second value is : "+num2);
		
		if (num1>num2)
		{
			System.out.println("The Maximum number is : "+num1);
		}
		else
		{
			System.out.println("The Maximum number is : "+num2);
		}
	}
}

		
		