//Utwórz tablicę liczb typu int zaprezentowaną na rysunku 2.43. 
//Wypełnij kolejne komórki wartościami malejącymi od 10 do 1.
//Do utworzenia tablicy i wypełnienia jej danymi wykorzystaj pętle typu for.

package javaPraktycznyKursWydanieIV;

public class Tablice12_3 {
	public static void main(String[] args) {
		int[][] triangle = new int[4][];
		int counter = 10;

		for (int i = 4; i > 0; i--) {
			triangle[4 - i] = new int[i];
		}
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] = counter--;
			}
		}
		for (int i = 0; i < triangle.length; i++) {
			System.out.print("tab{" + i + "] = ");
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
