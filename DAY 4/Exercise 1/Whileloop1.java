import java.util.Scanner;
class Whileloop1{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number to find the summation:");
		int num=ob.nextInt();
		int i=0;
		int sum=0;
		while (i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.print("the Summation of the numbers from 0 to "+num +" is :"+sum);
	}
}

		