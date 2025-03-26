import java.util.Scanner;
class javaEx6{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value for counter01:");
		int counter01=ob.nextInt();
		System.out.print("Enter the value for counter02:");
		int counter02=ob.nextInt();
		for(int i=0; i<counter01 ;i++)
		{
			System.out.println("The value for i is: "+i);
			for(int j=0; j<counter02; j++)
			{
				System.out.println("The values for j is: "+j+" ");
			}
			System.out.println();
		}
	}
}
				
		