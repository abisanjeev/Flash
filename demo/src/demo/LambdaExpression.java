package demo;

interface calc{
	abstract void add();
	default void sub(){
		System.out.println("This is first default method");
	}
	default void multi(){
		System.out.println("This is second default method ");
	}
		
	
	
}





public class LambdaExpression {
	public static void main (String args[]){
		calc obj = ()->{
			
			System.out.println("This is abstract method");
						
		};
		obj.add();
		
		
	}

}
