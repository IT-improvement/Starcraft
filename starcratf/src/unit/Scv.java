package unit;

import controller.GroundUnit;
import model.Damageable;
import model.Repairable;

class Scv extends GroundUnit implements Damageable, Repairable {

	public Scv(String name, int hp) {
		super("scv", 20);
	}

	@Override
	public void damage(int n) {
		while (n > 0) {
			setHpMinas();
			n--;
		}
	}

}
