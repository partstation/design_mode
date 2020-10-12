package com.partstation.strategy;

@FunctionalInterface
public interface Comparator<T> {
	int comparaTo(T t1, T t2);
}
