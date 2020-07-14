package ua.lviv.desctop.pt1;

import ua.lviv.desctop.pt1.Engine;
import ua.lviv.desctop.pt1.SteeringWheel;

public class Autho {

	private int horsePower;
	private int yearOfProduction;
	private SteeringWheel wheel;
	private Engine engine;

	public Autho(int horsePower, int yearOfProduction, SteeringWheel wheel, Engine engine) {
		super();
		this.horsePower = horsePower;
		this.yearOfProduction = yearOfProduction;
		this.wheel = wheel;
		this.engine = engine;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public SteeringWheel getWheel() {
		return wheel;
	}

	public void setWheel(SteeringWheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Autho [horsePower=" + horsePower + ", yearOfProduction=" + yearOfProduction + ", wheel=" + wheel
				+ ", engine=" + engine + "]";
	}

}
