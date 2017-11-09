/* Veiva Piner
 * 11/8/17
 * Period 1
 */
// I = 1
// V = 5
// X = 10
// L = 50
// C = 100
package romanNumerals;
import java.util.Scanner;

public class romanNumerals {
	
	public static void main (String[]args){
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a number between 0 and 100 and I will convert it to Roman numerals!");
		int n = in.nextInt();
		System.out.println(romanDigit(n));
	}

	public static String romanDigit(int n){
		String romanOnes = "";
		String romanTens = "";
		String romanHundred = "";
		if((n%10)<4){
			for (int i=0; i<(n%10); i++){
				romanOnes = romanOnes+"I";
			}
		} else if((n%10)==4){
			romanOnes = "IV";
		} else if (((n%10)>4)&&(n%10<9)){
			romanOnes = "V";
			for (int i=0; i<((n%10)-5); i++){
				romanOnes = romanOnes+"I";
			}
		} else if ((n%10)==9){
			romanOnes = "IX";
		} else {
			romanOnes = "";
		}
		n = n/10;
		if(n<4){
			for (int i=0; i<n; i++){
				romanTens = romanTens+"X";
			}
		} else if (n==4) {
			romanTens = "IX";
		} else if((n>4)&&n<9){
			romanTens = "L";
			for (int i=0; i<n-5; i++){
				romanTens = romanTens+"X";
			}
		} else if (n==9){
			romanTens = "XL";
		} else if (n==10){
			romanHundred = "C";
		} else {
			romanTens = "";
		}
		return romanHundred+romanTens+romanOnes;
	}

}


