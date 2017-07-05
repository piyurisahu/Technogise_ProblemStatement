package com.piyuri.java;

import com.piyuri.java.Registration.Type;

public class TollCalculater {
	private Registration registration;
	private String state;
	private boolean isOngovtDuty;
	public TollCalculater(Registration registration, String state) 
	{
		// TODO Auto-generated constructor stub

		this.registration=registration;
		this.state=state;

	}
	public TollCalculater(Registration rc1, String string, boolean isGovtDuty) {
		// TODO Auto-generated constructor stub
		this.registration=registration;
		this.state=state;
		this.isOngovtDuty=isGovtDuty;
		
		
	
	}
	public int getCalculateTax() {
		// TODO Auto-generated method stub
		if(this.isOngovtDuty)
		if(this.state.equals(registration.getState()))
			return 0;

		if(registration.getNo_of_Wheels()==2)
				return 20;

		if(registration.getNo_of_Wheels()==3)
			return 60;
		if(registration.getNo_of_Wheels()==4)
		{
			if(registration.getType()==Type.Non_Transport)
			{
				return 100;
			}
				return 200;
		}

		if(registration.getNo_of_Wheels()==6)
			return 500;



		return 100;


	}

}
