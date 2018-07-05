package com.xx.sheji2;

public interface Subject {
	public void registerObserver(Object o);
	public void removeObserver(Object o);
	public void notifyObserver();
}
