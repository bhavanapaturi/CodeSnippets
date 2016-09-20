package com.adp.vehicle_classifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

import com.adp.vehicle_classifier.service.VehicleService;



public class VehicleServiceTest {

// this is a sample unit test case	
	@Test
	public void VehicleTest() {
		VehicleList vl = new VehicleList();
		List<Vehicle> listv = new ArrayList<Vehicle>() ;
		listv.add(buildVehicleone());
		vl.setVehicles(listv);
		Map<String,String> map = VehicleService.processVehiclesData(vl);
		Assert.assertNotNull(map);	
	}
	
	public Frame buildFrame(String m){
		Frame f = new Frame();
		f.setMaterial(m);
		return f;
	}
	public Wheel buildWheel(String m,String p ){
		Wheel w = new Wheel();
		w.setMaterial(m);
		w.setPosition(p);
		return w;
	}
	public Vehicle buildVehicleone(){
		
		Vehicle v = new Vehicle();
		Wheel[] w = new Wheel[3];
		String  material = "Plastic";
			v.setId("veh1");
			v.setPowertrain("human");
			v.setFrame(buildFrame(material));
			v.setWheels(w);
		return v;
	}
	
}
