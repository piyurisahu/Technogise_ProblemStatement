package com.piyuri.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.piyuri.java.Registration;
import com.piyuri.java.Registration.Type;
import com.piyuri.java.TollCalculater;

public class TollPlazaTest {

	@Test
	public void testforTwoWheeler()
	{
		Registration rc1= new Registration("MH14A1234",Type.Non_Transport,2,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MP");
		assertEquals(20,tollCalculator.getCalculateTax());
	
		
	}
	
	@Test
	public void testForThreeWheeler()
	{

		Registration rc1= new Registration("MH14A1232",Type.Non_Transport,3,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MP");
		assertEquals(60,tollCalculator.getCalculateTax());
	}
	
	@Test
	public void testForFourWheeler_LTV()
	{
		Registration rc1= new Registration("MH14A1232",Type.Non_Transport,4,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MP");
		assertEquals(100,tollCalculator.getCalculateTax());
	}
	
	@Test
	public void testForFourWheeler_NonTransport()
	{
		Registration rc1= new Registration("MH14A1232",Type.Transport,4,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MP");
		assertEquals(200,tollCalculator.getCalculateTax());
	}
	
	@Test
	public void testForSixWheel()
	{
		Registration rc1= new Registration("MH14A1232",Type.Transport,6,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MP");
		assertEquals(500,tollCalculator.getCalculateTax());
	}
	
	@Test
	public void testTaxCalculation_BasedOnState()
	{

		Registration rc1= new Registration("MH14A1232",Type.Transport,6,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MH");
		assertEquals(0, tollCalculator.getCalculateTax());
	}
	@Test
	public void testTaxCalculation_BasedOnGovtDuty()
	{

		Registration rc1= new Registration("MH14A1232",Type.Transport,6,2); 
		TollCalculater tollCalculator=new TollCalculater(rc1,"MP",true);
		assertEquals(0, tollCalculator.getCalculateTax());
	}
	
	
	
	

	
	
	

}
