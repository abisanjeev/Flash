package demo;

class AddNumbers{
	public void ShowAddition(int i,int j){
	int sum = i +j;
	System.out.println("Addition of 2 numbers is "+sum);
	
	}
	public void ShowAddition(int i, int j , int k){
		int sum = i + j + k ;
		System.out.println("Addition of 3 numbers is "+sum);
	}
	public void ShowAddition(int i, int j, int k, int l){
		int sum = i+j+k+l;
		System.out.println("Addition of 4 numbers is "+sum);
				
	}
}



public class MethodOverloading {
	public static void main (String args[]){
		
		AddNumbers obj = new AddNumbers();
		obj.ShowAddition(45,56);
	}

}
