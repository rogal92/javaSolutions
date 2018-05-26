
//Zmodyfikuj program z listingu 2.46 tak, aby do wypełnienia tablicy
//danymi były wyko- rzystywane pętle typu while.

package javaPraktycznyKursWydanieIV;

public class TabliceListing_2_46 {
		public static void main (String args[]) {
		int[][] tab = new int[4][]; tab[0] = new int[4];
		tab[1] = new int[3];
		tab[2] = new int[2];
		tab[3] = new int[1];
		int licznik = 1;
		int i = 0;
		while(i < tab.length) {
			int j = 0;
			while(j < tab[i].length) {
				tab[i][j] = licznik++;
				j++;
			}
			i++;
		}
		for(int i1 = 0; i1 < tab.length; i1++){ System.out.print("tab[" + i1 + "] = "); for(int j = 0; j < tab[i1].length; j++){
		System.out.print(tab[i1][j] + " "); }
		System.out.println(""); }
		} 
}
