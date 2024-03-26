package unit;

import controller.GroundUnit;
import model.Damageable;
import model.Repairable;

class Tank extends GroundUnit implements Repairable, Damageable {

	public Tank(String name, int hp) {
		super("tank", 100);
	}

	@Override
	public void damage(int n) {
		while (n > 0) {
			setHpMinas();
			n--;
		}
	}

}
