package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		System.out.println("Pixel 6a");
	}
	private void phoneImeiNum() {
		System.out.println("6595485647856415641");
	}
	private void Camera() {
		System.out.println("Pixel 6a cameras : 12.2 mp , 12 mp");
	}
	private void storage() {
		System.out.println("Storage 6GB of RAM and 128GB of UFS 3.1 storage");
	}
	private void osName() {
		System.out.println("Android version 13");
	}

	public static void main(String[] args) 
	{
		PhoneInfo phone = new PhoneInfo();
		phone.phoneName();
		phone.phoneImeiNum();
		phone.Camera();
		phone.storage();
		phone.osName();
	}

}
