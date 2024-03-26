package unit;

import controller.*;
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

	public void repair(Unit unit) {
		if (!unit.isRepairable()) {
			System.out.println("repair fail");
			return;
		}
		if (!unit.isDead()) {
			unit.setHpPlus();
			System.out.println("repair success");
		}
	}

}
