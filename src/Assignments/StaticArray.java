//Question 2: wap to create a static Array, having following cricket data:
//--name, age, team name, DOB, gender, Strike Rate
//--Try to create multiple Object Arrays for different players 
//--Try to print all the values of each player on the console

package Assignments;
public class StaticArray {
	public static void main(String[] args) {
		Object ob[]=new Object[] {"Sachin",40,"india","08-09-80","male",130};
		for(int i=0;i<ob.length;i++) {
			System.out.print(ob[i]+" ");}
		
		Object ob1[]=new Object[] {"Virat",35,"India","09-08-80","Male",125};
		System.out.println("\n");
		for(int j=0;j<ob1.length;j++) {
			System.out.print(ob1[j]+ " ");
		}
		Object ob2[]=new Object[] {"Dhoni",35,"Inida","09-08-85","Male",110};
		System.out.println("\n");
		for(int k=0;k<ob2.length;k++) {
			System.out.print(ob2[k]+ " ");
		}
		Object ob3[]=new Object[] {"Rohit",37,"India","07-04-85","Male",100};
		System.out.println("\n");
		for(int l=0;l<ob3.length;l++) {
			System.out.print(ob3[l]+ " ");
		
		

	}

}
}