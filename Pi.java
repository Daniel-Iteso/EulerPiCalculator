
public class Pi implements Calculation{
	
	private int iteration;//number of iterations >= 1
	private double result;//The result is being saved here
	private double odd = 1;//Helper to use only the odd numbers
	
	
	//Constructor
	public Pi(int iteration) {
		
		this.iteration = iteration;
		
	}

	
	//Getter to obtain the value of the calculation
	@Override
	public double calculateValue() {
		for (int i = 0; i<iteration; i++) {
			if (i%2 == 0) {//Since the Leibniz formula for Pi the operation changes every iteration
			
				result += 1/odd;//When it's even, an addition is made
				
			}else {
				
				result -= 1/odd;//When it's odd, a subtraction is made
				
			}
			
			odd += 2;//The helper odd must be the odd numbers corresponding to the iteration
		}
		return 4*result;//the result is multiplied by 4
	}
	
	

}
