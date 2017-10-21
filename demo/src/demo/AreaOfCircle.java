package demo;

public class AreaOfCircle {
	public static void main (String args[]){
		//I have a created an Anonymous object here as we have only one method here
		 new CircleArea().show(3);
		
		
	}

}

class CircleArea{
	public void show(int r){
		final double pi = 3.14;
		double area = pi * r * r ;
		System.out.println("Area of a circle is "+area);
		
		
		
	}
}
