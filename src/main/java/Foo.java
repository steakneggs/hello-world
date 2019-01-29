

public class Foo {

	public static void main(String []args) {
	
		System.out.println("Hello World");
		
		Fubar fubar = new Fubar(1, "John");
		System.out.println("id: " + fubar.getId());
		System.out.println("name: " + fubar.getName());
		Fubaz fubaz = new Fubaz(2, "Arya", "winterfell");
		System.out.println("id: " + fubaz.getId());
		System.out.println("name: " + fubaz.getName());
		System.out.println("location: " + fubaz.getLocation());
	}

}
