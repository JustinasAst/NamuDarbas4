package tank;

import tank.Valdymas.Kryptis;

public class TaskuRadimas {
	public static void main(String[] args) {
		Valdymas sp = new Valdymas();
		stumkTanka(sp, 1, 1);
		stumkTanka(sp, 3, 2);
	}
	
	public static void stumkTanka(Valdymas sp, int x, int y) {
		while (sp.getX() != x) {
			Kryptis norimaKryptis = Kryptis.RYTAI;
			if (x < sp.getX()) {
				norimaKryptis = Kryptis.VAKARAI;
			}
			
			while (!norimaKryptis.equals(sp.getKryptis())) {
				sp.desinen();
				System.out.println("desinen");
			}
			
			sp.pirmyn();
			System.out.println("pirmyn");
		}
		
		while (sp.getY() != y) {
			Kryptis norimaKryptis = Kryptis.SIAURE;
			if (y < sp.getY()) {
				norimaKryptis = Kryptis.PIETUS;
			}
			
			while (!norimaKryptis.equals(sp.getKryptis())) {
				sp.desinen();
				System.out.println("desinen");
			}
			
			sp.pirmyn();
			System.out.println("pirmyn");
		}
		
		System.out.println("Tankas atvaziavo i ("+sp.getX()+", "+sp.getY()+")");
	}

}
