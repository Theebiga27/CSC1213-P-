class Operator{
	public static void main(String args[]){
	// UnaryOperation
	
		int num=15;
		
	System.out.println("The initial value is "+num);
		

		int a=num++;
		int b=++num;
		int c=num--;
		int d=--num;
		
	
	System.out.println("The post increment value is: "+a);
	System.out.println("The pre increment value is: "+b);
	System.out.println("The post decrement value is: "+c);
	System.out.println("The pre decrement value is: "+d);
	System.out.println();
	
	  
	// LogicalOperation
	
	    boolean p=true;
		boolean q=false;
		
    System.out.println("p && q :"+(p && q));
	System.out.println("p || q :"+(p || q));
	System.out.println("!p :"+(!p));
    System.out.println("!q :"+(!q));
	System.out.println();
	
	
	// RelationalOperation
	
	    int num1=14;
		int num2=19;
		
	System.out.println("The First number is :"+num1);
	System.out.println("The Second number is :"+num2);
	
	System.out.println("num1 == num2  :"+(num1 == num2));
	
	System.out.println("num1!=num2 :"+(num1!=num2));
	
	System.out.println("num1>num2 :"+(num1>num2));
	
	System.out.println("num1>=num2 :"+(num1>=num2));
	
	System.out.println("num1<num2 :"+(num1<num2));
	
    System.out.println("num1<=num2 :"+(num1<=num2));
	
	System.out.println();
	
	
	//AssignmentOperation
	
	   int x=15;
		
	System.out.println("x += 5 :"+(x+=5));
		
	System.out.println("x -= 5 :"+(x-=5));
		
	System.out.println("x *= 5 :"+(x*=5));
		
	System.out.println("x /= 5 :"+(x/=5));
		
	System.out.println("x %= 5 :"+(x%=5));
	
	System.out.println();
		
		
	// TernaryOperation	
	    int r=10,s=25,t=30,maximum;
		
	maximum=((r>s)?(r>t)?r:t:(s>t)?s:t);
		
	System.out.println("The maximum of three number is "+maximum);
    System.out.println();	
	}
	}