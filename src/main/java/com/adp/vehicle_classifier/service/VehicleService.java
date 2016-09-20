package com.adp.vehicle_classifier.service;

import java.util.HashMap;
import java.util.Map;

import com.adp.vehicle_classifier.Vehicle;
import com.adp.vehicle_classifier.VehicleList;

public class VehicleService {

	public VehicleService() {
		
	}

	public static Map<String, String> processVehiclesData(VehicleList vehList) {

		Map<String, String> m = new HashMap<String, String>();
		for (Vehicle v : vehList.getVehicles()) {

			if (v.getFrame().getMaterial().equalsIgnoreCase("plastic")) {

				if (v.getPowertrain().equalsIgnoreCase("bernoulli")) {
					m.put(v.getId(), "Hang Glider");
				} else if(v.getFrame().getMaterial().equalsIgnoreCase("plastic") && v.getWheels().length == 3) {

					m.put(v.getId(), "Big Wheel");
				}
				else{
					m.put(v.getId(), "Not a Vehicle Listed Type");
				}

			} else {

				if (v.getPowertrain().equalsIgnoreCase("human")) {

					m.put(v.getId(), "Bicycle");
				} else {

					if (v.getPowertrain().equalsIgnoreCase(
							"internal-combustion")
							&& v.getWheels().length == 4) {

						m.put(v.getId(), "Car");
					} else if(v.getPowertrain().equalsIgnoreCase(
							"internal-combustion")
							&& v.getWheels().length == 2){

						m.put(v.getId(), "Motorcycle");
					}
					else{
						m.put(v.getId(), "Not a Vehicle Listed Type");
					}
				}
			}

		}

		return m;
	}
}
