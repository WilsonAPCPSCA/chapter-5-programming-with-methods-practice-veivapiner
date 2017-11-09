/* Veiva Piner
 * 11/8/17
 * Period 1
 */
package timeEnglish;
import java.util.Scanner;

public class timeEnglish {
	
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter the time in hours and minutes: ");
	int hours = in.nextInt();
	int min = in.nextInt();
	System.out.print(getTimeName(hours, min));
	}
	
	public static String getTimeName(int hours, int min){
		String englishName = "";
		String hourName = "";
		String hourNamePlusOne = "";
		if (hours==1){
			hourName = "one";
			hourNamePlusOne = "two";
		} else if (hours==2){
			hourName = "two";
			hourNamePlusOne = "three";
		} else if (hours==3){
			hourName = "three";
			hourNamePlusOne = "four";
		} else if (hours==4){
			hourName = "four";
			hourNamePlusOne = "five";
		} else if (hours==5){
			hourName = "five";
			hourNamePlusOne = "six";
		} else if (hours==6){
			hourName = "six";
			hourNamePlusOne = "seven";
		} else if (hours==7){
			hourName = "seven";
			hourNamePlusOne = "eight";
		} else if (hours==8){
			hourName = "eight";
			hourNamePlusOne = "nine";
		} else if (hours==9){
			hourName = "nine";
			hourNamePlusOne = "ten";
		} else if (hours==10){
			hourName = "ten";
			hourNamePlusOne = "eleven";
		} else if (hours==11){
			hourName = "eleven";
			hourNamePlusOne = "twelve";
		} else if (hours==12){
			hourName = "twelve";
			hourNamePlusOne = "one";
		}
		if (min==0){
			englishName = "It is "+hourName+"o'clock";
		} else if (min ==15){
			englishName = "It is quarter after "+hourName;
		} else if (min ==30){
			englishName = "It is half past "+hourName;
		} else if (min ==45){
			englishName = "It is quarter til "+hourNamePlusOne;
		} else {
			englishName = "It is "+min+" minutes past "+hourName;
		}
		return englishName;
	}

}
