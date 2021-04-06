package oops;

public class InheritanceImpl extends ParentClass{

	public InheritanceImpl() {
		System.out.println("I am in the child class");
	}
	public static void main(String[] args) {
		
		//Just creating the child instance itself will call the parent and child class  constructor
		InheritanceImpl obj1 = new InheritanceImpl();
		
		obj1.print();
	}

}
