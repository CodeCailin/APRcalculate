import javax.swing.*;


public class InterestApp {
	public static void main (String[]args){


	int months = 0;
	double  moneyBrd = 0.0;
	final double INTEREST = 0.05;
	double totalInterest = 0.0;
	double totalRepay = 0.0;


	//Object Declare, then assign


	months=Integer.parseInt(JOptionPane.showInputDialog(null,"How many months did you borrow money?"));



	moneyBrd=Double.parseDouble(JOptionPane.showInputDialog(null,"How much money did you borrow?"));




	//Process

	 totalInterest = (months * INTEREST);
	 totalRepay = ( moneyBrd + totalInterest);


	JOptionPane.showMessageDialog(null,"The total interest: " + totalInterest + ". Total repaymert: " + totalRepay);


}

}