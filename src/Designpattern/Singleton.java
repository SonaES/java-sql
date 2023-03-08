package Designpattern;

public final class Singleton {
	
	public static Singleton instance=null;
	private Singleton() {
	}
	public static Singleton getInstance() {
		if(instance==null) {
			instance =new Singleton();
			 
		}
		return getInstance();
	}

}
