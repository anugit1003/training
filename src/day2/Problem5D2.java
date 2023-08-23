package day2;

public class Problem5D2 {

	public static void main(String[] args) {
		double salary = 10000.0d;
		double revisedSalary;
		int workExp = 20;
		double award = 1000.0d;
		int numberOfAwardsReceived = 3;
		double percentaIncrease = 0.0d;
		
		

		if (workExp >= 3 && workExp <= 5) {
			
			percentaIncrease = 0.1d;
			//numberOfAwardsReceived =1;
			revisedSalary = reviseSalary(percentaIncrease, salary);

		} else if (workExp >= 6 && workExp <= 9) {
			percentaIncrease = 0.15d;
			//numberOfAwardsReceived = 3;
			revisedSalary = reviseSalary(percentaIncrease, salary);
			
		} else if (workExp >= 10 && workExp <= 20) {
			percentaIncrease = 0.20d;
			//numberOfAwardsReceived = 5;
			revisedSalary = reviseSalary(percentaIncrease, salary);
			
		} else {

			percentaIncrease = 0.25d;
			//numberOfAwardsReceived = 7;
			revisedSalary = reviseSalary(percentaIncrease, salary);
		}
		
		revisedSalary = revisedSalary + 1000*numberOfAwardsReceived;
		
		System.out.println("Original Salary is " + salary);
		System.out.println("Number of awards received is " + numberOfAwardsReceived);
		System.out.println("Revised salary for " + workExp + " years of work experience is Rs. " + revisedSalary);

	}
	
	private static double reviseSalary(double percentaIncrease, double salary) {
		
		double revisedSalary = salary + percentaIncrease * salary;
		
		
		return revisedSalary;
	}

}
