package unit;

import controller.GroundUnit;
import model.Damageable;

public class Marine extends GroundUnit implements Damageable {

	public Marine() {
		super("marine", 50);
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
