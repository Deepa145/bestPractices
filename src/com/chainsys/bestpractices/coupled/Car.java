package com.chainsys.bestpractices.coupled;
//Objects of this class can work
public class Car {

	private PetrolEngine engine;
	private SteelWheels [] wheels;
	
	public Car()
	{
		engine = new PetrolEngine();
		wheels = new SteelWheels[4];
		wheels[0] = new SteelWheels();
		wheels[0].location = "front Left";
		wheels[1] = new SteelWheels();
		wheels[1].location = "front right";
		wheels[2] = new SteelWheels();
		wheels[2].location = "back Left";
		wheels[3] = new SteelWheels();
		wheels[3].location = "back right";
	}
	public Car(PetrolEngine engine,SteelWheels[] wheel)
	{
		this.engine = engine;
		this.wheels=wheel;
		wheels = new SteelWheels[4];
		wheels[0].location = "front Left";
		wheels[1].location = "front right";
		wheels[2].location = "back Left";
		wheels[3].location = "back right";
	}
	public void startCar()
	{
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}
	public SteelWheels[] getWheels()
	{
		return this.wheels;
	}
}
