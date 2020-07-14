package ua.lviv.desctop.pt1;

public class Engine {

	private int valueOfCilindre;

	public Engine(int valueOfCilindre) {
		super();
		this.valueOfCilindre = valueOfCilindre;
	}

	public int getValueOfCilindre() {
		return valueOfCilindre;
	}

	public void setValueOfCilindre(int valueOfCilindre) {
		this.valueOfCilindre = valueOfCilindre;
	}

	@Override
	public String toString() {
		return " [valueOfCilindre=" + valueOfCilindre + "]";
	}

}
