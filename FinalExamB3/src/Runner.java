import javax.swing.JOptionPane;

/* INSTRUCTIONS
 * 1. Create FinalExam_lastName Java Project
 * 2. Create class "Runner," and class "Converter"
 * 3. Instantiate both classes in main
 * 4. Use JOP's for all I/O -- do not leave any syso you might have
 *    used for debugging
 * 5. In myRunner.enterInteger(); tell allowable range is 0 - 255,
 *    and test for that range; if outside of that range tell them
 *    and ask for another try at entering a base-10 number 0-255
 * 6. Complete all necessary code, below
 * 7. Create and use a Git repository
 * 8. Create and use a GitHub repository
 * 9. Show Mr. M for a grade!
 */

public class Runner {

	public static void main(String[] args) {

		int intBase10 = 0;
		String hexAnswer = "";

		Runner myRunner = new Runner();
		Converter myConverter = new Converter();

		myRunner.welcome();

		intBase10 = myRunner.enterInteger();

		hexAnswer = myConverter.changeToHex(intBase10);
		
		

		// for testing, remove all syso when done
		JOptionPane.showMessageDialog(null, "0-255 entry: " + intBase10 + ", hex conversion: " + hexAnswer);
		String go;
		//Runner myRunner = new Runner();
		go = JOptionPane.showInputDialog("Do you want to try again?(y or n)");
		if (go.equals("y")){
			myRunner.main(null);
		}
		else{
			return;
		}
		//System.out.println("0-255 entry: " + intBase10 + ", hex conversion: " + hexAnswer);

		// now JOP the answer
		// then JOP "Do you want to enter another 0-255 Yes or No"
		// place this in a loop, keep looping as long as they answer Yes

	}

	private int enterInteger() {
		// code for you to complete
		String ans = "";
		int start = 0;
		String rerun;
		ans = JOptionPane.showInputDialog("Please enter the number you with to convert(please keep the numbers between 0 and 255)");
		try{
			start = Integer.parseInt(ans);
		}
		catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "You did not enter an integer");
			Runner myRunner = new Runner();
			rerun = JOptionPane.showInputDialog("Do you want to try again?(y or n)");
			if (rerun.equals("y")){
				myRunner.main(null);
			}
			else{
				return start;
			}
		}

		// for basic test return 0 (hex 00), or 255 (hex FF)
		return start;
		
}

	public void welcome() {
		JOptionPane.showMessageDialog(null,
				"Welcome, this program converts base-10 integers " + "between 0-255 to hexadecimal");
	}

}