import java.util.Scanner;
class doWhile3{
	public static void main(String args[]){
		Scanner op=new Scanner (System.in);
		int num=0;
		   int sum=0;
		   int i=0;
		   int j=0;
		   char result=' ';
		do
		{
		   
		   System.out.print("Enter number to find the summation :");
		   num=op.nextInt();
		   sum=sum+num;
		   System.out.print("Do you want to continue (Y/N):");
		   result =op.next().charAt(0);
		   if (num%2==0)
		   {
			   i++;
		   }
		   else 
		   {
			   j++;
		   }
			   
		}
		while(result =='Y');
		
		System.out.println("Summation of the number is: "+sum);
		System.out.println("Count the even numbers of user had Entered : "+i);
		System.out.println("Count the odd numbers of user had Entered : "+j);
		  
	}
	
}