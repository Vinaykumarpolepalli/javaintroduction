package javademo1;

public class StaticBlock1 {
	

	static    StaticBlock1 s = new StaticBlock1();	
	
	
	public static void main(String[] args) {
		
	System.out.println("main block is started");
	//s.staicblock1();
	}
	
	{
		
	
	}
	 ///static  blocks
	static{  
		System.out.println("static  block is started");
	
	
		
	}
	//instance blocks
	{
	
    System.out.println("instance  block is stared and ended");
      
      
	}
	
}

	
		


