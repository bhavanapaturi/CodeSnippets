package com.adp.vehicle_classifier;

public class Vehicle {

	public String id;

	public Frame frame;

	public Wheel wheels[];

	public String powertrain;

	public Vehicle() {
	}

	public Vehicle(String id, Frame frame, Wheel[] wheel, String powertrain) {
		this.id = id;
		this.frame = frame;
		this.wheels = wheel;
		this.powertrain = powertrain;
	}

	public String getId() {
		return id;
	}

	public Frame getFrame() {
		return frame;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public String getPowertrain() {
		return powertrain;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public void setPowertrain(String powertrain) {
		this.powertrain = powertrain;
	}
}
