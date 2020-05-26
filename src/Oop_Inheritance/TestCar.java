package Oop_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW(); 
		b.start();
		b.stop();
		b.refuel();
		b.autofuel();
		System.out.println(b.getCarName("BMW520"));
		
		car c=new car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		car c1=new BMW();
		c1.start();
		c1.stop();
		c1.engine();
		c1.refuel();
		BMW b1=(BMW) new car();
		b1.start();

	}
	

}
