package com.partstation.responsibilitychain;

public interface Filter<T> {
	boolean doFilter(T t);
}
