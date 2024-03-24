public class MatrixEqual
{
	public static void main(String[] args) {
		
		int arr1[][] = {
		    
		    {2,4,6},
		    {6,7,8},
		    {2,3,1}
		};
		
		int arr2[][] = {
		    
		    {2,4,6},
		    {6,7,8},
		    {9,5,6}
		};
		

		int rows1 = arr1.length;
		int cols1 = arr1[0].length;
		
		int rows2 = arr2.length;
		int cols2 = arr2[0].length;
		
		int temp = 0;
		
		if(rows1 != rows2 || cols1 != cols2){
		    
		    System.out.println("Matrices are not Equals");
		}
		
		else{
		    
		for(int i = 0; i<rows1; i++){
		    for(int j = 0; j<cols1; j++){
		        
		        if(arr1[i][j] != arr2[i][j]){
		            
		            temp++;
		            break;
		        }
		 
		    }
		}
		    
		}
		
		if(temp>0){
		    
		    System.out.println("Matrices are Not Equals");
		}else{
		    
		    System.out.println("Matrices are not equals");
		}
		
		
		
	}
}