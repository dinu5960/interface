package org.com;


// Interface is set of rules
//

public class ABCEmployee implements EmployeeRules,Family {
	
		public void report() {
			
			System.out.println("daily");
		
	}
		public void dress() {
			System.out.println("noral");
			
			
		}
		
		
		public void maintainHours() {
		
		System.out.println("70");
		
	}
		
		public void helpMember() {
			
			System.out.println("yes");
			
			
		}
		
		public void enjoy() {
			
			System.out.println("wel");
		

		}
		public static void main(String[] args) {
		
			ABCEmployee abc =new ABCEmployee ();
			
			abc.maintainHours();
			abc.dress();
			abc.maintainHours();
			
			abc.enjoy();
			abc.helpMember();
			
			Family father=new ABCEmployee();
			father.helpMember();
			
			father.enjoy();
			
			
			System.out.println(abc.salary);
			System.out.println(abc.leaves);
			
			
			
		}
}
