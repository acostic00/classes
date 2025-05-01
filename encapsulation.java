package classes;

public class encapsulation {
	private String name;
	private int age;
	public void set_name(String n) {
		name = n;
	}
	public void set_age(int a) {
		age = a;
	}
	public int get_age() {
		return age;
	}
	public String get_name() {
		return name;
	}

	public static void main(String[] args) {
		encapsulation ob1 = new encapsulation();
		ob1.set_name("Praful");
		ob1.set_age(20);
		String n = ob1.get_name();
		int a = ob1.get_age();
		System.out.println("Name of the person is : "+n);
		System.out.println("Age of the person is : "+a);

	}

}
