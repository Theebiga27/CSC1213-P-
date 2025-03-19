import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		String fname;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your first name: ");
		fname=sc.nextLine();
		
		System.out.print("Entr your last name: ");
		String lname=sc.next();
		
		System.out.print("Enter your marks:");
		int marks=sc.nextInt();
		
		System.out.println("Full name: "+fname+" "+lname+"\n"+"marks is:"+marks);
	}
}
