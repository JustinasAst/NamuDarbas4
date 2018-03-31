package tank;

public class Valdymas {
	public enum Kryptis {
		SIAURE("Siaure"), PIETUS("Pietus"), RYTAI("Rytai"), VAKARAI("Vakarai");
		private String pavadinimas;

		Kryptis(String pavadinimas) {
			this.pavadinimas = pavadinimas;
		}

		public String getPavadinimas() {
			return pavadinimas;
		}		
	}

	private Kryptis kryptis = Kryptis.SIAURE;
	Suvis[] suviai = new Suvis[10];
	private int suvis = 0;
	private int y = 0;
	private int x = 0;

	public Valdymas() {
		this.kryptis = Kryptis.SIAURE;
	}

	void pirmyn() {

		switch (kryptis) {
		case SIAURE:
			y++;
			break;
		case RYTAI:
			x++;
			break;
		case PIETUS:
			y--;
			break;
		case VAKARAI:
			x--;
		}

	}

	void atgal() {

		switch (kryptis) {
		case PIETUS:
			y--;
			break;
		case VAKARAI:
			x--;
			break;
		case SIAURE:
			y++;
			break;
		case RYTAI:
			x++;

		}

	}

	public void kairen() {
		switch (kryptis) {
		case SIAURE:
			kryptis = Kryptis.VAKARAI;
			break;
		case VAKARAI:
			kryptis = Kryptis.PIETUS;
			break;
		case PIETUS:
			kryptis = Kryptis.RYTAI;
		case RYTAI:
			kryptis = Kryptis.SIAURE;
		}

	}

	public void desinen() {
		switch (kryptis) {
		case SIAURE:
			kryptis = Kryptis.RYTAI;
			break;
		case RYTAI:
			kryptis = Kryptis.PIETUS;
			break;
		case PIETUS:
			kryptis = Kryptis.VAKARAI;
			break;
		case VAKARAI:
			kryptis = Kryptis.SIAURE;
			break;

		}

	}

	public void suvis() {
		Suvis kulka = new Suvis(kryptis, y, x);
		suviai[suvis] = kulka;
		suvis++;
	}

	public void info() {
		Kryptis rezultatasY;
		Kryptis rezultatasX;
		if (y > 0) {
			rezultatasY = Kryptis.SIAURE;
		} else {
			rezultatasY = Kryptis.PIETUS;
		}
		if (x > 0) {
			rezultatasX = Kryptis.VAKARAI;
		} else {
			rezultatasX = Kryptis.RYTAI;
		}

		System.out.println("Tanko pozicija:" + " " + rezultatasY.getPavadinimas() + ":" + y + " "+ rezultatasX.getPavadinimas() + ":" + " " + x);
		System.out.println("Tanko kryptis: " + kryptis.getPavadinimas());
		System.out.println("Isauti suviai: " + suvis);
		int siaure = 0;
		int pitus = 0;
		int rytai = 0;
		int vakarai = 0;
		for (int i = 0; i < suvis; i++) {
			Suvis suvis = suviai[i];
			switch (suvis.getKryptis()) {
			case SIAURE:
				siaure++;
				break;
			case PIETUS:
				pitus++;
				break;
			case RYTAI:
				rytai++;
				break;
			case VAKARAI:
				vakarai++;
			}
		}
		if(y > 0 ) {
		System.out.println("Suviai i siaure: " + siaure);
		}
		if(y<0) {
		System.out.println("Suviai i pietus: " + pitus);
		}
		if(x > 0) {
		System.out.println("Suviai i rytus: " + rytai);
		}
		if(x<0) {
		System.out.println("Suviai i vakarus: " + vakarai);
		}

		for (int i = 0; i < suvis; i++) {
			Suvis suvis = suviai[i];
			System.out.println(
					"Suvis i " + suvis.getKryptis().getPavadinimas() + ", koordinates: (" + suvis.getX() + ", " + suvis.getY() + ")");
		}
	}

	public int getY() {
		return y;
	}


	public int getX() {
		return x;
	}

	public Kryptis getKryptis() {
		return kryptis;
	}

}
