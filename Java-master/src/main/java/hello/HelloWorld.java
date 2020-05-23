package hello;

public class HelloWorld {
	public static void main(String[] args) {
		//Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		//System.out.println("Sisesta nimi");

		//String Nimi = myObj.nextLine();  // Read user input
		//System.out.println("Nimi on: " + Nimi);  // Output user input

		Greeter greeter = new Greeter();

		System.out.println(greeter.ytleTere(""));


	}
}


