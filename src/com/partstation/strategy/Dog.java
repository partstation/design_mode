package com.partstation.strategy;

public class Dog {

	private int food;
	private int weight;

	public Dog() {}

	public Dog(int food) {
		this.food = food;
	}

	public Dog(int food, int weight) {
		this(food);
		this.weight = weight;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog{" +
			"food=" + food +
			", weight=" + weight +
			'}';
	}
}
