package demo;


public class Add2DArrays {
	public static void main(String args[]){
		
		int array1[][] = {
				
				         {5,6,7,8,9},
				         {1,2,3,4,7},
			             {3,5,7,9,5}
				
	                	};
		
		int array2[][] = {
				
				         {15,46,87,98,22},
		                 {11,22,23,64,11},
	                     {23,25,27,29,13}
		
				
		                };
		
		int array3[][] = new int [3][5];
		
		for(int rows = 0; rows < array1.length; rows++){
			for(int column = 0; column <array1[0].length; column++ ){
				array3[rows][column] = array1[rows][column] + array2[rows][column] ;
			}
			
			
		}
		for(int rows = 0 ; rows < array3.length ; rows++ ){
			for(int column = 0; column < array3[rows].length; column ++){
				System.out.print(array3[rows][column] +" "); 
			}
			
			System.out.println();
		}
		
		
		
	}

}
