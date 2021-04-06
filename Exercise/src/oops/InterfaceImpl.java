package oops;

public interface InterfaceImpl {

	public default void log() {
		System.out.println("Now a default method can be defined in interface from Java 8");
	}
}
