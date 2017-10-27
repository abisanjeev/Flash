package demo;

class Calc{
	public int add(int nums[][]){
		int sum = 0;
		for(int row = 0; row < nums.length ; row++)
			for(int column = 0; column < nums[0].length; column++){
				sum = sum + nums[row][column];
				
			}
				
			return sum;
		}
		
		
	}





public class AddArray {
public static void main (String[]args){
	int nums[][] = {
			
			{5,6,7,8,9},
	        {1,2,3,4,7},
            {3,5,7,9,5}
	
       	           };

	Calc obj = new Calc();
	int result = obj.add(nums);
	System.out.println(result);
	
			
	
}
}
