//Problem 5
public class bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    outerloop:
		    for (int i=0; i < 5; i++) {
		      for (int j=0; j < 5; j++) {
		        if (i * j > 6) {
		          System.out.println("Breaking");
		          break outerloop;
		        }
		        System.out.println("Bus 1 A 10:00 D 10:05"+"Bus 2 A 10:05 D 10:15"+"Bus 3 A 10:10 D 10:30"+"Bus 4 A 10:25 D 10:40"+"Bus 5 A 10");
		        
		      }
		     
		    }
		    System.out.println("Done");
		  }
	}


