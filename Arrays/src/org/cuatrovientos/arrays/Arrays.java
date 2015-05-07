/**
 * 
 */
package org.cuatrovientos.arrays;

import java.util.Scanner;
/**
 * @author PC
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "";
		Scanner reader = new Scanner(System.in);
		String array[] = new String[10];
		for ( int i = 0; i < 10; i++){
			System.out.println("Número " + (i + 1));
			array[i] = reader.nextLine();
			
		}
		for ( int j = 0; j < array.length; j++){
			System.out.println(array[j]);
		}
		}
}


