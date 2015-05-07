/**
 * 
 */
package org.cuatrovientos.arrays;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class Arrays03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "";
		Scanner reader = new Scanner(System.in);
		String array[] = {"0","0","0","0","0","0","0","0","0","0"};
	
		for (int i = 0; i < array.length; i++){
			System.out.println("Number: ");
			line = reader.nextLine();
			array[i] = line;
		}
		for ( int i = 0; i < array.length; i++){
			for ( int j = 0; i < array.length; j++){
				if ( array[i] == array[j]){
					System.out.println("Repeated element");
					System.exit(0);
				}
			}
		
		}
	}

}
