package javademo1;

public class Assigement1 {

	public static void hello() { ///static method 1
		
		System.out.println("first static  method is started1");
		friend();
		//a.good();
	}
  public static void friend() { //static method 2
			System.out.println("second static method is started2");
			hello();
		
		}
	

	public void fine() { // instance method 1
		System.out.println("first  instance method is started1");
		friend();
		//a.good();
	}

	public void good() {  //instance method 2
		System.out.println("second   instance method is started2");
		hello();
	}

	public static void main(String[] args) {

		System.out.println("main method is started");
		hello();
		//a.fine();

	}

}
