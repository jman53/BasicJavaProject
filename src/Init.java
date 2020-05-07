package basicJavaProjects;


public class Init {
	
	public static void help() {
		System.out.println("welcome to help");
		System.exit(1);
	}
	
	
	 public static void main(String[] args) {
		    System.out.println("Welcome to Basic Java Projects");
		    if (args.length ==0) {
		    	System.out.println("!");
		    	System.out.println("No Mode Detected, Entering Help");
		    	help();
		    }
		    System.out.println(args[0]);
		  }

}
