package org.phone;

public class Phone {
	private void phoneInfo(String phName) {
		System.out.println("Name of the Mobile : " + phName);
	}

	private void phoneInfo(float price) {
		System.out.println("MRP of the mobile in INR : " + price);
	}
	
	private void phoneInfo(long imeiNo) {
		System.out.println("IMEI number for the mobile : " + imeiNo);
	}
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo("Google Pixel 7 Pro");
		ph.phoneInfo(84999f);
		ph.phoneInfo(1254655478954456411l);
		
	}

}
