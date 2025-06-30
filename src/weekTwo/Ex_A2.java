package weekTwo;

public class Ex_A2 {

	public static void main(String[] args) {
		
		AlgebraicExpression(2,3);
	}
	
	public static void AlgebraicExpression(int x, int a) {
		
		
		System.out.println("Evaluating 'y = ax3 + 7' where x == " + x +" and a == " + a );
		
		int y= (a*x*x*x + 7);//31
		System.out.println("y = a * x * x * x + 7 sets y to : " + y); //31
		
		y= (a*x*x*(x + 7));
		System.out.println("y = a * x * x * (x + 7) sets y to : " + y); //108
		
		y= ((a*x)*x*(x + 7));
		System.out.println("y = (a * x) * x * (x + 7) sets y to : " + y); //108
		
		y= ((a*x)*x*x + 7);
		System.out.println("y = (a * x) * x * x + 7 sets y to : " + y); //31
		
		y= (a*(x*x*x) + 7);
		System.out.println("y = a * (x * x * x) + 7 sets y to : " + y); //31
		
		y= (a*x*(x*x + 7));
		System.out.println("y = a * x * (x * x + 7) sets y to : " + y); //66
		
		y= (int) (a*Math.pow(x, 3) + 7);//using Math.pow
		System.out.println("using Math.pow: " + y);
		
	}

}
