package unit;

import controller.AirUnit;
import model.Damageable;
import model.Repairable;

public class DropShip extends AirUnit implements Damageable, Repairable {

	public DropShip(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void damage(int n) {
		
	}

	@Override
	public void fly() {

	}

}
