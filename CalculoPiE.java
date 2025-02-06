import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculoPiE {
	
	public static void main(String[] args) {
		
		boolean error = true;
		
		JButton Euler = new JButton("Euler");
	    JButton Pi = new JButton("Pi");

	    //Generacion de un nuevo panel
	    JPanel myPanel = new JPanel();
	    myPanel.add(Euler); //Se agrega el campo para leer
	    myPanel.add(Box.createHorizontalStrut(5)); // un espaciador
	    myPanel.add(Pi); //Se agrega el campo para leer
	    String iteration = JOptionPane.showInputDialog(null,"Give me the number of iterations");
	    while (error == true && iteration != null) {
	    	try{
	    		int iter = Integer.parseInt(iteration);
	    		if(iter <= 0) {iteration = JOptionPane.showInputDialog(null, "The number must be a real positive number");continue;}
		    	error = false;
		    	JOptionPane.showConfirmDialog(null, myPanel, "Please select one", JOptionPane.OK_CANCEL_OPTION); //Se muestra el panel
		    	Euler.addActionListener(e -> askForEuler(iter));
		    	Pi.addActionListener(e -> askForPi(iter));
		    }catch (Exception e) {
		    	JOptionPane.showMessageDialog(null, "It is not a number, try again","ERROR", JOptionPane.ERROR_MESSAGE);
		    	iteration = JOptionPane.showInputDialog(null,"Give me the number of iterations");
		    }
		    	
	    }
	    
	    if(iteration == null)JOptionPane.showMessageDialog(null, "The user closed the program", "ERROR", JOptionPane.ERROR_MESSAGE);
	    
		
	}

	private static Object askForPi(int iter) {
		
		
		System.out.println("Prubas");
		Calculo pi = new Pi(iter);
		JOptionPane.showMessageDialog(null, pi.calculateValue(), "Pi value",JOptionPane.DEFAULT_OPTION); 
		
		return null;
	}

	private static Object askForEuler(int iter) {
		
		Calculo euler = new Euler(iter);
		JOptionPane.showMessageDialog(null, euler.calculateValue(), "Pi value",JOptionPane.DEFAULT_OPTION); 
		
		return null;
	}

}
