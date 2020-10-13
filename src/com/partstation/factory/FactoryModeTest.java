package com.partstation.factory;

public class FactoryModeTest {
	public static void main(String[] args) {

		AbstractFactory factory = new ModernFactory();
		Food food = factory.createFood();
		Vehicle vehicle = factory.createVehicle();
		Weapon weapon = factory.createWeapon();

		Person p = new Person(food, weapon, vehicle);
		p.say();

	}
}
