package com.chainsys.bestpractices.decoupled;

//Objects of this class can work with any engine, and with any wheel
//The car class is decoupled from PetrolEngine class, and steelwheel class
public class Bike {

	private Iengine engine;// early bound with engine interface
	public Iengine getEngine() {
		return engine;
	}
	//The type of engine  will be injected to the bike class
	// At runtime using the setter method . This is called as setter based
	// Dependency injection
	
	public void setEngine(Iengine engine) {
		this.engine = engine;
	}

	//The type of engine  will be injected to the bike class
		// At runtime using the setter method . This is called as setter based
		// Dependency injection
	public void setWheels(IWheel[] wheels) {
		this.wheels = wheels;
	}

	private IWheel[] wheels;// early bound with wheel interface

//	public Bike(Iengine de, IWheel[] wheel) {
//		this.engine = de;
//		this.wheels = wheel;
//
//	}

	public void startBike() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
	}

	public IWheel[] getWheels() {
		return this.wheels;
	}
}
