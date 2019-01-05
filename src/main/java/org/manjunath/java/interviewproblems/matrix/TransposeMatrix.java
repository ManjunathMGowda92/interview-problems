package org.manjunath.java.interviewproblems.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TransposeMatrix class is used to read the input matrix from the user through
 * console and then convert it into transpose
 * 
 * <p> The methods included in this class are :</p>
 * <ol>
 * 		<li>readMatrix() : To read the input matrix from the user through the console </li>
 * 		<li>transposeMatrix() : To convert the input matrix to transpose </li>
 * 		<li>printMatrix(): To print the matrices </li>
 * </ol>
 * 
 * @author Manjunath HM
 *
 */
public class TransposeMatrix {

	/**
	 * readMatrix() method is used read the matrix. User has to enter the each
	 * element of matrix.
	 * 
	 * <p>
	 * If NumberFormatException occurred in the middle because of faulty inputs then
	 * the code will exit. And other Exception's are handled by catch block.
	 * </p>
	 * 
	 * @return :Complete square matrix which contains inputs given by the user.
	 */
	public static int[][] readMatrix() {
		int[][] inputMatrix = null;
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter rowColumn count");
			int rowColumnCount = Integer.parseInt(reader.readLine());
			
			inputMatrix = new int[rowColumnCount][rowColumnCount];
			
			System.out.println("Please enter the matrix elements ::");
			for (int i = 0; i < rowColumnCount; i++) {
				for (int j = 0; j< rowColumnCount; j++) {
					System.out.println("Enter element");
					int num = Integer.parseInt(reader.readLine());
					inputMatrix[i][j] = num;
				}
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred::"+e);
			System.exit(0);
		}catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return inputMatrix;
	}
	
	/**
	 * getTransposeMatrix() method is used to convert the given input matrix to its transpose.
	 * 
	 * @param matrix :Input matrix for transpose.
	 * @return :Transposed Matrix
	 */
	public static int[][] getTransposeMatrix(int[][] matrix) {
		int[][] transposeMatrix = null;
		int length = matrix.length;
		transposeMatrix = new int[length][length];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j< length; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}
		
		return transposeMatrix;
	}
	
	/**
	 * printMatrix() method used to print the elements of input matrix.
	 * 
	 * @param matrix :Input matrix for printing the elements.
	 */
	public static void printMatrix(int[][] matrix) {
		int length = matrix.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(matrix[i][j] + " ");	
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * runnerMethod() is used to handle all above three methods i.e readMatrix,
	 * getTransposeMatrix and printMatrix methods.
	 */
	public static void runnerMethod() {
		int[][] inputMatrix = readMatrix();
		int[][] transposeMatrix = null;
		
		if (inputMatrix != null)
			transposeMatrix = getTransposeMatrix(inputMatrix);
		
		if (transposeMatrix != null) {
			System.out.println("Input Matrix is ::::");
			printMatrix(inputMatrix);
			
			System.out.println("Transpose Matrix is ::::");
			printMatrix(transposeMatrix);
		}
	}
	
	public static void main(String[] args) {
		runnerMethod();
	}
}
