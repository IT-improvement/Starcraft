package unit;

import controller.AirUnit;
import model.Damageable;
import model.Repairable;

public class DropShip extends AirUnit implements Damageable, Repairable {

	public DropShip() {
		super("dropship", 80);
	}

	@Override
	public void damage(int n) {
		while (n > 0) {
			setHpMinas();
			n--;
		}
	}

	@Override
	public void fly() {

	}

}
