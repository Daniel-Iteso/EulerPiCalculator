import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculoPiE {
	
	public static void main(String[] args) {
		
		boolean error = true; //Helper to know if the user set a wrong value
		
		JButton Euler = new JButton("Euler");//New button to execute the Euler calculation
	    JButton Pi = new JButton("Pi");//new button to execute the Pi calculation
	    
	    //The new panel is generated
	    JPanel myPanel = new JPanel();
	    myPanel.add(Euler); //The first button is added
	    myPanel.add(Box.createHorizontalStrut(5)); //Spacer between the buttons
	    myPanel.add(Pi); //The second button is added
	    String iteration = JOptionPane.showInputDialog(null,"Give me the number of iterations");//A window asking for the number of iterations is shown
	    
	    //Validation of the values
	    while (error == true && iteration != null) { //The input should be a natural number and the helper error must be false
	    	try{
	    		int iter = Integer.parseInt(iteration);//the value iter is taken from the iteration String
	    		if(iter <= 0) {iteration = JOptionPane.showInputDialog(null, "The iterations must be a natural number");continue;}//If the iter <= 0 the program asks for the value again
		    	error = false; //If the value is a natural number, the error helper is set to false
		    	Euler.addActionListener(e -> askForEuler(iter, myPanel)); //An action listener is added to execute the method askForEuler when pressed
		    	Pi.addActionListener(e -> askForPi(iter, myPanel));//An action listener is added to execute the method askForPi when pressed
		    	JOptionPane.showConfirmDialog(null, myPanel, "Please select one", JOptionPane.OK_CANCEL_OPTION); //The panel with the buttons is shown
		    }catch (Exception e) { //if the iteration value cannot be transformed into a integer the exception is catch
		    	JOptionPane.showMessageDialog(null, "Please enter a natural number","ERROR", JOptionPane.ERROR_MESSAGE);//The error is shown
		    	iteration = JOptionPane.showInputDialog(null,"Give me the number of iterations");//the value is asked again
		    }
		    	
	    }
	    
	    //This case happens if the user closes the program
	    if(iteration == null)JOptionPane.showMessageDialog(null, "The user closed the program", "ERROR", JOptionPane.ERROR_MESSAGE);
	    
		
	}

	
	//Method to call the class Pi
	private static void askForPi(int iter, JPanel panel) {
		
		Calculation pi = new Pi(iter); //The constructor is called
		JOptionPane.showMessageDialog(panel, pi.calculateValue(), "Pi value",JOptionPane.DEFAULT_OPTION);//A panel is called showing the pi value
		JDialog topFrame = (JDialog) SwingUtilities.getWindowAncestor(panel);//the topFrame is obtained to close it once the "ok" button is pressed
		topFrame.dispose();//The frame is closed
		
	}

	
	//Method to call the class Euler
	private static void askForEuler(int iter, JPanel panel) {
		
		Calculation euler = new Euler(iter);//The constructor is called
		JOptionPane.showMessageDialog(panel, euler.calculateValue(), "Pi value",JOptionPane.DEFAULT_OPTION);//A panel is called showing the euler value
		JDialog topFrame = (JDialog) SwingUtilities.getWindowAncestor(panel);//the topFrame is obtained to close it once the "ok" button is pressed
		topFrame.dispose();//The frame is closed
	
	}

}
