

import java.util.Scanner;

public class Keitykla {
	public static void main(String[] args) {
		Scanner klv= new Scanner(System.in);
		System.out.println("Iveskite suma kuria norite pasmulkinti: ");
		int pinigai = klv.nextInt();
		while(pinigai > 0) {
			if (pinigai >= 20 ) {
				System.out.println("20 eurai");
				pinigai -= 20;
		   }
			else if (pinigai >= 10 ) {
				System.out.println("20 eurai");
				pinigai -= 10;
		   }
			else if (pinigai >= 5 ) {
				System.out.println("5 eurai");
				pinigai -= 5;
		   }
			else if (pinigai >= 2) {
				System.out.println("2 eurai");
				pinigai -= 2;
			
		   }
			else if (pinigai >=1) {
				System.out.println("1 euras");
				pinigai -=1;
			}
		
	   }
		
     }
   }

