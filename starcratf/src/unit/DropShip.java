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
			if (this.isDead()) {
				System.err.println("Dead");
				System.err.println(this);
				return;
			}
			setHpMinas();
			n--;
		}
		System.err.println("Attacked!! ");
		System.out.println(this);
	}

	@Override
	public void fly() {

	}

}
