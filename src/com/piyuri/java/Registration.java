package com.piyuri.java;

import com.piyuri.java.Registration.Type;

public class Registration {
	
	
	public Registration(String vehicalNo,  Type type,int no_of_Wheels, int no_Of_axle) {
		super();
		this.vehicalNo = vehicalNo;
		this.no_of_Wheels = no_of_Wheels;
		this.no_Of_axle = no_Of_axle;
		this.type = type;
	}
	public Registration(String string, Type transport, int i, int j, boolean isGo) {
		// TODO Auto-generated constructor stub
		
	}
	public String getVehicalNo() {
		return vehicalNo;
	}
	public void setVehicalNo(String vehicalNo) {
		this.vehicalNo = vehicalNo;
	}
	public int getNo_of_Wheels() {
		return no_of_Wheels;
	}
	public void setNo_of_Wheels(int no_of_Wheels) {
		this.no_of_Wheels = no_of_Wheels;
	}
	public int getNo_Of_axle() {
		return no_Of_axle;
	}
	public void setNo_Of_axle(int no_Of_axle) {
		this.no_Of_axle = no_Of_axle;
	}
	public void setType(Type type) {
		this.type = type;
	}
	private String vehicalNo;
	private int no_of_Wheels;
	private int no_Of_axle;
	private Type type;
	public enum Type
	{
		Transport,
		Non_Transport;
	}
	public String getVehicleNo() {
		// TODO Auto-generated method stub
	
		return this.vehicalNo;
	}
	public Type getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
	public String getState() {
		
		return String.valueOf(vehicalNo.charAt(0)+String.valueOf(vehicalNo.charAt(1)));
		
		
		
		// TODO Auto-generated method stub
		
	}
}
