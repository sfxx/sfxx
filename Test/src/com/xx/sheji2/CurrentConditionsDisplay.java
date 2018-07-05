package com.xx.sheji2;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temp;
	private float humidity;
	private Subject weatherDate;
	public CurrentConditionsDisplay(Subject weatherDate){
		this.weatherDate = weatherDate;
		weatherDate.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions:"+temp+humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
