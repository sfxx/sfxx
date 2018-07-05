package com.xx.sheji2;

import java.util.ArrayList;

public class WeatherDate implements Subject{
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherDate(){
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Object o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Object o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>0){
			observers.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
