
public class Euler implements Calculation{
	
	private int iteration;//Number of iterations >=1
	private double result;//The result is being saved here
	private double factor;//Helper to calculate the factor of a number
	
	//Constructor
	public Euler(int iteration) {
		
		this.iteration = iteration;
		
	}
	
	
	//Getter to obtain the calculation
	@Override
	public double calculateValue() {
		
		for (int i=0; i<iteration;i++) {
			
			if (i == 0) {//0's factor is 1
			
				factor = 1;
			
			}else {//Calculation of any factor greater or equal than 1
				
				factor *= i;
			
			}
			
			result += 1/factor;//Value of the Euler series
			
		}
		
		return result;
	}

	
	
}
