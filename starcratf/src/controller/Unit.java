package controller;

import model.Repairable;

public abstract class Unit {
	public final int MAX_HP;
	private int hp;
	private String name;
	private boolean isDead;

	public Unit(String name, int hp) {
		MAX_HP = hp;
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setHpPlus() {
		if (hp < MAX_HP)
			hp++;
	}

	public void setHpMinas() {
		hp--;
		if (hp == 0)
			isDead = true;
	}

	public boolean isRepairable() {
		if (this instanceof Repairable)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s: %d/%d", name, hp, MAX_HP);
	}
}
