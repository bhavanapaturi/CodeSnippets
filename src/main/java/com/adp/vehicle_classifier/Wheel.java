package com.adp.vehicle_classifier;

public class Wheel {

	public String position;

	public String material;

	public Wheel() {

	}

	public Wheel(String p, String m) {

		this.position = p;
		this.material = m;

	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
