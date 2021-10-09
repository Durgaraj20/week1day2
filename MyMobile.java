package week1.day2;

public class MyMobile {
	String shape="square";
	String IMEI="345K";
	int resolution=25;
	private char brand;
	boolean isTouchScreen;
	
	public void makeCalls() {
		System.out.println("Making calls");
	}
	public void viewGallery() {
		System.out.println("view gallery");
	}
	private void payBills() {
		System.out.println("Pay my bills");
	}
	public static void main(String[] args) {
		
		
		MyMobile samsung = new MyMobile();
		samsung.brand='s';
		samsung.IMEI= "23847378398Q";
		samsung.shape= "square";
		samsung.resolution=23;
		samsung.isTouchScreen=true;
		
		samsung.makeCalls();
		samsung.viewGallery();
		samsung.payBills();
		
		System.out.println("Brand name is "+samsung.brand);
			
		System.out.println("Shape of the mobile is "+samsung.resolution);
		
		
		
				
				

	}

}
