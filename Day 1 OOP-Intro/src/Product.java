
public class Product {
	
	public Product( ) { 
		System.out.println("Ben �al��t�m");
	}//constructor
	
	public Product(int id,String name,double unitPrice,String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}//overriding
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
