package controller;

abstract class Unit {
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
		hp = MAX_HP;
	}

	public void setHpMinas() {
		hp--;
		if (hp == 0)
			isDead = true;
	}

}
