package unit;

import controller.GroundUnit;
import model.Damageable;
import model.Repairable;

public class Tank extends GroundUnit implements Repairable, Damageable {

	public Tank() {
		super("tank", 100);
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

}
