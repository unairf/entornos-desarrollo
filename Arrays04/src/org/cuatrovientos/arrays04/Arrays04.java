/**
 * 
 */
package org.cuatrovientos.arrays04;

import java.util.Scanner;

/** Arrays 04
 * @author Unai Rodríguez
 *
 */
public class Arrays04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line = "";
		Scanner reader = new Scanner(System.in);
		String array[] = {"","","","","","","","","",""};
		
		for ( int i = 0; i < 10;i++){
			System.out.println("Introduce un número");
			array[i] = reader.nextLine();
		}
		for ( int j = 0; j < 11; j++){
			System.out.println((Integer.parseInt(array[j])) + 1);
		}
		System.exit(0);
	}

}