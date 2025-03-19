import java.util.Scanner;
class StuDetails{
	public static void main(String args[]){
		String name;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter your Full name: ");
		name=sc.nextLine();
		
		System.out.print("Enter your Age:");
		int Age=sc.nextInt();
		
		System.out.print("Enter your Registration number:");
		String RegNo=sc.next();
		
		System.out.print("Enter your Sex:");
		char Sex=sc.next().charAt(0);
		
		System.out.print("Enter your Nobile Number:");
		long MobileNo=sc.nextLong();
		
		System.out.print("Enter your GPA:");
		double GPA=sc.nextDouble();
		
		
		System.out.println("Your Full name: "+name +"\n"+"Age is:"+Age +"\n"+"Your Registration number is:"+RegNo +"\n"+"Your Sex is:"+Sex +"\n"+ "Your Mobile Number is :"+MobileNo +"\n"+"Your GPA is :"+GPA);
	}
}
