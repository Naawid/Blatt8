package h1;

public class Bruch {
	public int zaehler;
	public int nenner;

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	private int ggt(int x, int y) {
		while (y != 0) {
			int r = x % y;   //2%1
			x = y;
			y = r;

		}
		return x;
	}

	public void shorten() {
		int t = ggt(this.zaehler, this.nenner);
		if (t != 0) {
			zaehler = zaehler / t;
			nenner = nenner / t;
		}
	}

	public boolean hasSameValueAs(Bruch b) {
		return this.zaehler * b.nenner == this.nenner * b.zaehler;
	}
}