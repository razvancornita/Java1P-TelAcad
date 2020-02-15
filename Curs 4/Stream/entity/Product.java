package Stream.entity;

public class Product {

	private final String name;

	public Product(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Product{name="+name+"}";
	}
	
}
