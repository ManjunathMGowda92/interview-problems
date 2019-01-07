package org.manjunath.java.interviewproblems.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IdentityMatrix class is used to check whether the input matrix is identity or
 * not.
 * <p> The methods included in this class are: <p>
 * <ol>
 * 		<li></li>
 * </ol>
 * 
 * @author Manjunath HM
 *
 */
public class IdentityMatrix {

	/**
	 * readMatrix() method is used to read the user inputs from the console.
	 * 
	 * @return :Input matrix entered by the user
	 */
	public static int[][] readMatrix() {
		int[][] inputMatrix = null;
		
		try (BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Please enter the row column count");
			int rowColumn = Integer.parseInt(reader.readLine());
			
			inputMatrix = new int[rowColumn][rowColumn];
			for (int i = 0; i < rowColumn; i++) {
				for (int j = 0 ; j < rowColumn; j++) {
					System.out.println("Enter element");
					int element = Integer.parseInt(reader.readLine());
					inputMatrix[i][j] = element;
				}
			}
		} catch(NumberFormatException e) {
			System.out.println("Number format Exception occurred. Hence exiting the code");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return inputMatrix;
	}
	
	/**
	 * isMatrixIdentity() method is used to check whether the given input matrix is
	 * identity or not
	 * 
	 * @param matrix : Input matrix to check identity or not
	 * @return : boolean condition whether the matrix is identity or not.
	 */
	public static boolean isMatrixIdentity(int[][] matrix) {
		int length = matrix.length;
		boolean isDiagonalOne = false;
		boolean isOtherElementsZero = false;
		
		outer: for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == j && matrix[i][j] == 1)
					isDiagonalOne = true;
				else if (i != j && matrix[i][j] == 0)
					isOtherElementsZero = true;
				else {
					isDiagonalOne = false;
					isOtherElementsZero = false;
					break outer;
				}
			}
		}
		
		if (isDiagonalOne && isOtherElementsZero)
			return true;
		else
			return false;
	}
	
	/**
	 * printMatrix() method is used to print the elements of given input matrix.
	 * 
	 * @param matrix : Input matrix for printing.
	 */
	public static void printMatrix(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void execute() {
		int[][] inputMatrix = readMatrix();
		
		if (inputMatrix != null) {
			boolean isIdentity = isMatrixIdentity(inputMatrix);
			
			System.out.println("The input matrix is :");
			printMatrix(inputMatrix);
			
			if (isIdentity)
				System.out.println("The given matrix is Identity matrix");
			else
				System.out.println("The given matrix is not identity matrix");
			
		}
	}
	
	public static void main(String[] args) {
		execute();
	}
}
