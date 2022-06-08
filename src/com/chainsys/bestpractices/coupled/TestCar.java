package com.chainsys.bestpractices.coupled;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car=new Car();
car.startCar();
//PetrolEngine pe = new PetrolEngine();
//pe.start();
//pe=null;
SteelWheels[] carWheel=car.getWheels();
int length=carWheel.length;
for(int i=0;i<length;i++)
{
System.out.println(carWheel[i].location);	
}
	}

}
