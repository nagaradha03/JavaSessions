package Oop_Inheritance;

public class BMW extends car 
{
@Override
 public void start() {
	 System.out.println("Bmw...start");
 }
 public void autofuel() {
	 System.out.println("Bmw autofuel");
	 
 }
 private String carName(String name) {
	 return "carname" +name;
 }
 public String getCarName(String name) {
	 return carName(name);
 }
}
