package CellPhone;

public class CellPhone {
	private String brand;
	private int serialNumber;
	private double price;
	private static int serialCounter = 10000;

	CellPhone(String br, double pr) {
		brand = br;
		price = pr;
		serialNumber = serialCounter;
		serialCounter++;
	}

	CellPhone(CellPhone c) {
		brand = c.brand;
		price = c.price;
		serialNumber = serialCounter;
		serialCounter++;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	@Override
	public String toString() {
		System.out.println("CellPhone [brand=" + brand + ", serialNumber=" + serialNumber + ", price=" + price + "]");
		return null;
	}

	public static void displayInventory(CellPhone c) {
		System.out.println("CellPhone [brand=" + c.getBrand() + ", serialNumber=" + c.getSerialNumber() + ", price="
				+ c.getPrice() + "]");
//        System.out.println("The Cellphone's brand is : " + c.getBrand());
//        System.out.println("The Cellphone's serial Number is : " + c.getSerialNumber());
//        System.out.println("The Cellphone's price is : " + c.getPrice());
	}
}
