// A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
package MethodsAssignments;
public class VoteMethod {
	public static void main(String[] args) {
		VoteMethod v= new VoteMethod();
		v.Eligible(8);
	}
	public void Eligible(int age) {
		if(age>=18) 
			System.out.println("She/He Eligible for vote");
		else
			System.out.println("She/He Not eligible for vote");
	}
}
