package com.partstation.factory;

public class ModernFactory extends AbstractFactory {
	@Override
	public Food createFood() {
		return new Bread();
	}

	@Override
	public Weapon createWeapon() {
		return new AK47();
	}

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}
