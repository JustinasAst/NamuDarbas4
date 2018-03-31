package tank;

import tank.Valdymas.Kryptis;

public class Suvis {
	private Kryptis kryptis;
	private int y;
	private int x;
	Suvis(Kryptis kryptis, int y, int x){
		this.kryptis=kryptis;
		this.y=y;
		this.x=x;
	}
	public Kryptis getKryptis() {
		return kryptis;
	}
	public void setKryptis(Kryptis kryptis) {
		this.kryptis = kryptis;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	

}
