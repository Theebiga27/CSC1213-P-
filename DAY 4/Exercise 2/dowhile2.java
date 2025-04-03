import java.util.Scanner;
class dowhile2{
	public static void main(String args[]){
		Scanner op=new Scanner (System.in);
		int num=0;
		   int sum=0;
		   char result=' ';
		do
		{
		   
		   System.out.print("Enter number to find the summation");
		   num=op.nextInt();
		   sum=sum+num;
		   System.out.print("Do you want to continue (Y/N):");
		   result =op.next().charAt(0);
		  
		}
		while(result =='Y');
		
		System.out.println("Summation of the number is: "+sum);
	}
	
}

		   
		
		   
		   
		   
		