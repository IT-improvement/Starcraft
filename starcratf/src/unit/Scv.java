package unit;

import controller.GroundUnit;
import model.Damageable;
import model.Repairable;

class Scv extends GroundUnit implements Damageable, Repairable {

	public Scv(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void damage(int n) {

	}

}
