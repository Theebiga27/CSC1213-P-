import java.util.Scanner;
class javaEx5{
	public static void main(String [] args){
		Scanner ob=new Scanner (System.in);
		System.out.print("Enter a number:");
		int num=ob.nextInt();
		for (int i=1;i<=num;i++)
		{
			System.out.print(i+"\t");
		}
	}
}
