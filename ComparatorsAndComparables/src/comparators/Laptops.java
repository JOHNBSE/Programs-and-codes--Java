package comparators;

public class Laptops implements Comparable<Laptops>{
	private String Brand;
	private int ram;
	private int price;
	
	
	
	public Laptops(String brand, int ram, int price) {
		super();
		Brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String getBrand() {
		return Brand;
	}
	@Override
	public String toString() {
		return "Laptops [Brand=" + Brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int compareTo(Laptops lap2) {
		if(this.getRam()< lap2.getRam()) {
			return 1;
		}else
		
		return -1;
	}

}
