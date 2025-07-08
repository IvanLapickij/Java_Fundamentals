package week2;

public class VariableScope {
	
	int instanceVariable = 10;
	static int classVariable = 23;
	
	public static void main(String[] args) {
		int localVariable = 8;
		localVariable = 20;
		
		VariableScope var = new VariableScope();
		
		System.out.println(var.instanceVariable);
		System.out.println(classVariable);
	}
}
