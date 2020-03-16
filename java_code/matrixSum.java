import java.awt.*;
import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import stanford.cs106.util.RandomGenerator;

import java.applet.*;
import java.util.*;

public class BlankClass extends ConsoleProgram{
	
	public void run() {
		int[][] a = {{1, 2, 3}, {4, 4, 4}};
		int[][] b = {{5, 5, 6}, {0, -1, 2}};
		println("a: " + Arrays.deepToString(a));
		println("b: " + Arrays.deepToString(b));
		println("sum :" + Arrays.deepToString(matrixSum(a, b)));
	}
	
	private int[][] matrixSum(int[][] a, int[][]b) {
		// assume matrix array a and b have same dimensions
		// so make a same size new matrix array
		int row = a.length;
		int col = a[0].length;
		// creat a matrix array to store sum of a and b
		int[][] sum = new int[row][col];
		
		// Add elements at the same position in a matrix array
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				sum[r][c] = a[r][c] + b[r][c]; 
			}
		}
		
		return sum;
	}
}