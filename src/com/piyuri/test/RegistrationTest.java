package com.piyuri.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.piyuri.java.Registration;
import com.piyuri.java.Registration.Type;

public class RegistrationTest {

	@Test
	public void testShouldReturnValidRC() {
	Registration rc1= new Registration("MH14A1234",Type.Non_Transport,2,2); 
	assertEquals("MH14A1234", rc1.getVehicleNo());
	assertEquals(Type.Non_Transport, rc1.getType());
	assertEquals(2, rc1.getNo_of_Wheels());
	assertEquals(2, rc1.getNo_Of_axle());
	assertEquals("MH", rc1.getState());
	Registration rc2= new Registration("MP14A1233",Type.Non_Transport,2,2);
	assertEquals("MP14A1233", rc2.getVehicleNo());
	assertEquals("MP", rc2.getState());

	
	}

}
