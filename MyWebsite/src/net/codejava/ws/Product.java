package net.codejava.ws;

public class Product {
	private int id;
	private String name;
	private float price;
	//private String link;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id) {
		this.id = id;
	}
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/*public Product(int id, String name, float price,String link) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.link = link;*/

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	/*public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
