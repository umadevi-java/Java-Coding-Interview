package oops;

/*
A method can now be defined in the interface so we need not implement the interface
thus bridging down the difference of abstract class and an interface
previously only abstract class can have methods defined and interface should have only declaration
so even if we dont override the method here after Java 8 this class compiles just fine
This give rise to diamond problem as we had with multiple inheritance , as we dont know which super class method to 
call in case of same name.Now we can use the desired Interface from which default method we can use by specifying Interfacename.super.methodName()
*/
public class InterfaceRunner implements InterfaceImpl {

	public static void main(String[] args) {
		
		InterfaceRunner obj2 = new InterfaceRunner();
		System.out.println("See I have compiled without any errors though the method is not overridden here");
		obj2.log();
	}
	
	@Override
	public void log() {
		System.out.println("But the default method can also be overrridden");
	}

}
