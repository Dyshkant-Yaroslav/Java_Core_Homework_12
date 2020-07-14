package ua.lviv.desctop.pt1;

public class SteeringWheel {
	private int diam;
	private String matherial;

	public SteeringWheel(int diam, String matherial) {
		super();
		this.diam = diam;
		this.matherial = matherial;
	}

	public int getDiam() {
		return diam;
	}

	public void setDiam(int diam) {
		this.diam = diam;
	}

	public String getMatherial() {
		return matherial;
	}

	public void setMatherial(String matherial) {
		this.matherial = matherial;
	}

	@Override
	public String toString() {
		return " [diam=" + diam + ", matherial=" + matherial + "]";
	}

}
