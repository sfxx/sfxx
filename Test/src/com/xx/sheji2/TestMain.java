package com.xx.sheji2;

public class TestMain {
	public static void main(String[] args){
		WeatherDate weatherDate = new WeatherDate();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDate);
		weatherDate.setMeasurements(80, 65, 30);
	}
}
