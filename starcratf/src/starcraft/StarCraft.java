package starcraft;

import unit.*;

public class StarCraft {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		Scv scv = new Scv();
		Marine marine = new Marine();
		System.out.println(tank);
		System.out.println(dropShip);
		System.out.println(scv);
		System.out.println(marine);
		tank.damage(10);
		dropShip.damage(70);
		scv.repair(dropShip);
		System.out.println(dropShip);
		marine.damage(10);
		scv.repair(marine);
		System.out.println(marine);
		marine.damage(41);
	}
}
