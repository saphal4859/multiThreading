package test;

public class sequentialProcess {

	public static void main(String[] args) {
		System.out.println("Started");
		execute1();
		execute2();
	}
	private static void execute2() {
		System.out.println("Execute 1");		
	}

	private static void execute1() {
		System.out.println("Execute 2");		
	}

}
