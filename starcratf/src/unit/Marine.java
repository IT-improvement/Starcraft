package unit;

import controller.GroundUnit;
import model.Damageable;

class Marine extends GroundUnit implements Damageable {

	public Marine(String name, int hp) {
		super("marine", 50);
	}

	@Override
	public void damage(int n) {
		while (n > 0) {
			setHpMinas();
			n--;
		}
	}
}
