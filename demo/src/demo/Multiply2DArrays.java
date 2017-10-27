package demo;

public class Multiply2DArrays {
public static void main(String args[]){
		
		int arrayA[][] = {
				
				         {5,6,7,8,9},
				         {1,2,3,4,7},
			             {3,5,7,9,5}
				
	                	};
		
		int arrayB[][] = {
				
				         {15,46,87,98,22},
		                 {11,22,23,64,11},
	                     {23,25,27,29,13}
		
				
		                };
		
		int arrayC[][] = new int [3][5];
		
		for(int rows = 0; rows < arrayA.length; rows++){
			for(int column = 0; column <arrayA[0].length; column++ ){
				arrayC[rows][column] = arrayA[rows][column] * arrayB[rows][column] ;
			}
			
			
		}
		for(int rows = 0 ; rows < arrayC.length ; rows++ ){
			for(int column = 0; column < arrayC[rows].length; column ++){
				System.out.print(arrayC[rows][column] +" "); 
			}
			
			System.out.println();
		}
		
		
		
	}

	

}
