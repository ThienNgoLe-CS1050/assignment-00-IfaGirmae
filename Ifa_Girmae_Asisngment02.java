import javax.swing.JOptionPane;
public class Ifa_Girmae_Asisngment02 {

	public static void main(String[] args) {
		String firstName = " ";  // input fist name
		char middleInitial; 
		String lastName; // input last name
		int age; // input age
		double grossAnnualPay; // input gross annual pay
		double taxRate; // input tax rate
		double netAnnualPay; // input net annual pay
		// Variables declarations
		firstName  = JOptionPane.showInputDialog("Enter your first name");; //Create scanner object to receive user input
		// assigns user input to middle initial variable
		middleInitial = JOptionPane.showInputDialog( "Enter your middle initial").charAt(0);
		//Alternate way to receive input from user
		lastName = JOptionPane.showInputDialog("Enter your last name.");
		age = Integer.parseInt(JOptionPane.showInputDialog( "Enter your current age"));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your gross annual pay before taxes"));
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your local tax rate in decimal form?(ex.5 = 50%)"));
		netAnnualPay = grossAnnualPay - (grossAnnualPay*taxRate);
		//outputs reponses made by user
		JOptionPane.showMessageDialog(null,  " Hello " + firstName + " " + middleInitial + 
				". "  + lastName + "! You are "+ age +" years old now. "
				+  "\n Congratulations, this year you brought in " + "$" +
				grossAnnualPay + "\n With the tax rate of " + taxRate + 
				" , " + "you're take home is " + "$" + netAnnualPay +" ! ");
		//close dialogue box 
		System.exit(1);
		
		
		
		
		

	}

}
