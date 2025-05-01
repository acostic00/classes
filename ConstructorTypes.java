package classes;
class student{
	int id;
	String name;
	int age;
	//Default Constructor
	student(){
		id= 03;
		name = "nishith jain";
		age = 17;
	}
	
	//Parameterized Constructor
	student(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println("The id is : "+id);
		System.out.println("The name is : "+name);
		System.out.println("The age is : "+age);
	}
}
public class ConstructorTypes {
	public static void main(String[] args) {
		System.out.println("Default Constructor");
		student ob1 = new student();
		ob1.display();
		
		System.out.println("Parameterized Constructor");
		student ob2 = new student(1,"Praful jain",18);
		ob2.display();
	}
}
