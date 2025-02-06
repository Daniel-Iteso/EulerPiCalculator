
public class Pi implements Calculo{
	
	private int iteration;
	private double result;
	private double odd = 1;
	
	public Pi(int iteration) {
		
		this.iteration = iteration;
		
	}

	@Override
	public double calculateValue() {
		for (int i = 0; i<iteration; i++) {
			if (i%2 == 0) {
			
				result += 1/odd;
				
			}else {
				
				result -= 1/odd;
				
			}
			
			odd += 2;
		}
		return result;
	}
	
	

}
