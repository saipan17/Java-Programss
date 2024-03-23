public class UpperTriangular
{
	public static void main(String[] args) {
		
		
		int arr[][] = {
		    
		    {1,2,3},
		    {8,5,7},
		    {9,12,6}
		};
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		if(rows != cols){
		    
		    System.out.println("Matrix should be square matrix");
		}
		
		for(int i = 0; i<rows; i++){
		    
		    for(int j = 0; j<cols; j++){
		        
		        if(j<i){
		            
		            System.out.print(0);
		        }else{
		            
		            System.out.print(arr[i][j] + " ");
		        }
		    }
		    
		    System.out.println("");
		}
	}
}
