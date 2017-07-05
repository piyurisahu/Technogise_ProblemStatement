package com.piyuri.java;

public class ThreeWheeler implements CalculatingTx{
	
	Registration rc;

	ThreeWheeler(Registration rc){
		this.rc=rc;
	}
	@Override
	public int calculateTax() {
		// TODO Auto-generated method stub
		if(rc.getNo_of_Wheels()==2)
			return 20;
		return 0;
	}

}
