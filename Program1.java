package javademo1;

public class Program1 {
	
	
	int jerscynumber = 45;
	String name = "rohit"; 
	
	
	static int countrynumber= 91;
	static String countryname ="india";
	
	Program1 (int a){
		   System.out.println(a);
	}
	
	
	Program1 (String names){
	   System.out.println(names);
	}

	
	

	public static void main(String[] args) {
     System.out.println("welcome players boys");
     System.out.println("countrynumber:"+countrynumber);
     System.out.println("countryname:"+countryname);
     
     
     Program1 p = new Program1(7);
     System.out.println("jerscynumber:"+ p.jerscynumber);
     System.out.println("name:"+p.name);
    matches();
    p.worldcup();


	}
	public static void matches() {
		   System.out.println("to play matches in india");	   	
	}
	
	public void worldcup() {
		System.out.println("winner will get the worldcup and runners will get the water packets");	
		}
	
	
	
	
}

