package controller;

public abstract class AirUnit extends Unit {
	public AirUnit(String name, int hp) {
		super(name, hp);
	}

	public abstract void fly();
}
