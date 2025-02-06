
public class Euler implements Calculo{

	
	private int iteration;
	private double result;
	private double factor;
	
	
	public Euler(int iteration) {
		
		this.iteration = iteration;
		
	}
	
	@Override
	public double calculateValue() {
		
		for (int i=0; i<iteration;i++) {
			
			if (i == 0) {
			
				factor = 1;
			
			}else {
				
				factor *= i;
			
			}
			
			result += 1/factor;
			
		}
		
		return result;
	}

	
	
}
