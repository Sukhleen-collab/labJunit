package helix;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class MatrixHelixMorphTest {

    /** Check if two integer matrices have the same contents
     *
     * @param matrix1
     * @param matrix2
     * @return true if the contents of matrix1 and matrix2 are identical and false otherwise
     */
    public static boolean testEqual(int[][] matrix1, int[][] matrix2) {

        /*
            Basic sanity checking:
                Verify that lengths are equal
         */
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        /*
            Test the contents of the matrices
         */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test2x2() {
        int[][] inMatrix  = { {1, 2}, {3, 4} };
        int[][] expOutput = { {1, 2}, {4, 3} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

    @Test
    public void test1x1() {
        int[][] inMatrix  = { {1} };
        int[][] expOutput = { {1} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }

   
    

	@Test
    public void test3x3() {
        int[][] inMatrix  = { {4,1,2},{3,8,6},{5,7,9}};
        int[][] expOutput = { {4,1,2},{7,9,3},{5,6,8} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }
    @Test
    public void test4x4() {
        int[][] inMatrix  = { {4,1,2},{3,8,6},{5,7,9}};
        int[][] expOutput = { {4,1,2},{7,9,3},{5,6,8} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }
    @Test
    public void test5x5() {
        int[][] inMatrix  = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] expOutput = { {1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9} };
        assertTrue(testEqual(expOutput, MatrixHelixMorph.helix(inMatrix)));
    }
    
    
}
