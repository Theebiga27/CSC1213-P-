import java.util.Scanner;
class javaEx2{
	public static void main(String[] args){
		Scanner ob=new Scanner (System.in);
		System.out.print("Enter the first number:");
		int x=ob.nextInt();
		System.out.print ("Enter the second number:");
		int y=ob.nextInt();
		System.out.print ("Enter the third number:");
		int z=ob.nextInt();
		if ((x>y) && (x>z)){
			System.out.println("The maximum number is "+x);
		}
		else if (y>z){
			System.out.println("The maximum number is "+y);
		}
		else{
			System.out.println("The maximum number is "+z);
		}
	}
}
