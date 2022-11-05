package T_lab;
/*

******
*    *
*    *
******

*/
public class Ouestion_3_pattern_2 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=4;i++) { // Condition Required for Column...
 			if(i==1 || i==4) { // As the 1st and 4th rows are similar.....
				System.out.println("******");
			}
			else if(i==2 || i==3) { // As the 2nd and 3rd rows are similar.....
				System.out.println("*    *");
			}
		}

	}

}
