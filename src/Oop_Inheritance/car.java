package Oop_Inheritance;

public class car extends Vehicle{
	public void start() {
		System.out.println("car... start");
	}
	public void stop() {
		System.out.println("Car ....stop");
		
	}
   public void refuel() {
	   System.out.println("car..refuel");
   }
   private String carName(String name)
   {
	   System.out.println("car name "+name);
	   return name;
   }
}
