package ConstructorAssignments;
import java.util.ArrayList;
public class UniversityTest {
	public static void main(String[] args) {
		ArrayList<String> course=new ArrayList<String>();
		course.add("Engineering");
		course.add("Medicine");
		course.add("B.Pharmacy");
		
		University Andhra=new University("AndhraUniversity",1926);
		University Osmania=new University("OsmaniaUniversity","India");
		University Annamalai=new University("AnnamalaiUniversity","India",1929,course);
		System.out.println(Andhra.getName()+" "+Andhra.getEstablishedDate());
		System.out.println(Annamalai.getCourse());
		System.out.println(Osmania.getCountry()+" " +Osmania.getName()+ " "+Osmania.getCourse());
		}


	}

