package com.partstation.factory;

public class Person {
	private Food food;
	private Weapon weapon;
	private Vehicle vehicle;

	public Person(Food food, Weapon weapon, Vehicle vehicle) {
		this.food = food;
		this.weapon = weapon;
		this.vehicle = vehicle;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person{" +
			"food=" + food +
			", weapon=" + weapon +
			", vehicle=" + vehicle +
			'}';
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void say() {
		this.food.printName();
		this.vehicle.go();
		this.weapon.shoot();
	}
}
