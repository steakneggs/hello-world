

public class Foo {

	public static void main(String []args) {
	
		System.out.println("Hello World");
		
		Fubar fubar = new Fubar(1, "John");
		System.out.println("id: " + fubar.getId());
		System.out.println("name: " + fubar.getName());
	}

}