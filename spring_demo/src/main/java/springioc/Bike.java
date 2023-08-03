package springioc;

public class Bike 
{
	String brand;
	double price;
	int cc;
	
	MusicSystem system;
	
	

	public Bike(String brand, double price, int cc, MusicSystem system) {
		super();
		this.brand = brand;
		this.price = price;
		this.cc = cc;
		this.system = system;
	}



	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", cc=" + cc + ", system=" + system + "]";
	}



	

	

	
	
	

}
