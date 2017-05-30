import javax.swing.JOptionPane;
public class Converter {

	public String changeToHex(int intBase10) {
		String rerun = "";
		// code for you to complete
		if (intBase10 < 0 || intBase10 > 255) {
			JOptionPane.showMessageDialog(null, "Error, range outside of 0-255, please try again");
			// JOP "Error, range outside of 0-255, please try again
			Runner myRunner = new Runner();
			rerun = JOptionPane.showInputDialog("Do you want to try again?(y or n)");
			if (rerun.equals("y")){
				myRunner.main(null);
				return null;
			}
			else{
				return null;
			}
		}
		
		// basic test
		String hexAnswer = Integer.toHexString(intBase10);


		return hexAnswer;
	}

	
}