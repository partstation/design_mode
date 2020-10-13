package com.partstation.factory;

public abstract class AbstractFactory {
	public abstract Food createFood();
	public abstract Weapon createWeapon();
	public abstract Vehicle createVehicle();
}
