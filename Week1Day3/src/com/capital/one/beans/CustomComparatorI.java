package com.capital.one.beans;

public interface CustomComparatorI<T> {
	int compare(T one, T two);
	
	int compare3(T one, T two, T three);
}
