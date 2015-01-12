package com.lcf.dp.abstractfactory;

public abstract class AbstractFactory {
	public abstract Vehicle createVehicle();
	
	public abstract Weapon createWeapon();
	
	public abstract Food createFood();
}
