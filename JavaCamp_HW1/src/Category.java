
public class Category {
	String name;
	int id;
	
	public Category() {
		System.out.println("Category constructor'in icindeyiz");
		
	}
	
	public Category(String name,int id) {
		this();
		this.id=id;
		this.name=name;
	}
	
}
