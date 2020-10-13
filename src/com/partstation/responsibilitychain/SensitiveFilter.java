package com.partstation.responsibilitychain;

public class SensitiveFilter implements Filter<String> {
	@Override
	public boolean doFilter(String s) {
		return false;
	}
}
