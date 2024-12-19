package javademo1;

public class GarbageCollector {

	public static void main(String[] args) {
		
		//object1
		 GarbageCollector g  = new GarbageCollector();
		 System.out.println(g);
		 //object2
		GarbageCollector g1 = new GarbageCollector();
		System.out.println(g1);
		//object3
	    GarbageCollector g2 = new GarbageCollector();
	    System.out.println(g2);
	    GarbageCollector g3 = new GarbageCollector();
	    System.out.println(g3);
	    
	    
	    
	    g=null;
	    System.out.println(g);
	    
	    g1=null;
	    System.out.println(g1);
	    
	    g2=g3;
	    System.out.println(g2);
	    System.out.println(g3);
	    //System.gc();
		

	}
   protected void finalize() {
	   System.out.println("finalize is stared");
   }
}
