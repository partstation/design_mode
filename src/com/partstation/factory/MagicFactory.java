package com.partstation.factory;

public class MagicFactory extends AbstractFactory {
	@Override
	public Food createFood() {
		return new MushRoom();
	}

	@Override
	public Weapon createWeapon() {
		return new MagicStick();
	}

	@Override
	public Vehicle createVehicle() {
		return new Broom();
	}
}
