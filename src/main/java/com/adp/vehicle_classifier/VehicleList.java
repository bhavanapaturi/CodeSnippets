package com.adp.vehicle_classifier;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class VehicleList {

	public List<Vehicle> vehicles;

	public VehicleList() {
		
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
