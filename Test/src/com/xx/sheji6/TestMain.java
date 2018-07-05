package com.xx.sheji6;

public class TestMain {
	public static void main(String[] args){
		RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		remoteControlWithUndo.setCommand(0,lightOnCommand,lightOffCommand);
		remoteControlWithUndo.OnButtonWasPusded(0);
		remoteControlWithUndo.undoButtonWasPusded();
		remoteControlWithUndo.OffButtonWasPusded(0);
		remoteControlWithUndo.undoButtonWasPusded();
	}

}
