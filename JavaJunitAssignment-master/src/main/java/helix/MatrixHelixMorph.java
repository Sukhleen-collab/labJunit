package helix;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {
    	
    	int row = inMatrix.length;
    	int column = inMatrix[0].length;
         
         if(row ==0) {
        	 return inMatrix;
         }
         
        
        int m=0;
        int s=row;
        int v=0;
        int d=row;
        int x=0;
        int y=0;
        char val = 'r';
         int[][]helixMatrix = new int[row][row];
         for(int i=0;i<row;i++) {
        	 for(int j =0;j<row;j++) {
        		 helixMatrix[x][y]= inMatrix[i][j];
        		 if(val =='s') {
        			 y++;
        			 if(y==s) {
        				 val ='d';
        				 y--;
        				 x++;
        				 s--;
        			 }
        		 }else if(val=='d') {
        			 x++;
        			 if(x==d) {
        				 val ='m';
        				 x--;
        				 y--;
        				 d--;
        			 }
        		 }else if(val =='m') {
        			 if(y == m) {
        				 val='v';
        				 x--;
        				 m++;
        			 }else {
        				 y--;
        			 }
        		 }else {
        			 if(x-1==v) {
        				 val='s';
        				 y++;
        				 v++;
        			 }else {
        				 x--;
        			 }
        		 }
        	 }
         }
         
    	
    	return helixMatrix;
    
    }
    
}