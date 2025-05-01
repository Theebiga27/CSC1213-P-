public class Ex4{
	static int findMax(int a,int b,int c){
		if (a>=b && a>=c){
			return a;
		}
		else if (b>=c){
			return b;
		}
		else
			return c;
	}
	public static void main(String[] args){
		int max=findMax(15,20,18);
		System.out.println("The maximum value is :"+max);
	}
}