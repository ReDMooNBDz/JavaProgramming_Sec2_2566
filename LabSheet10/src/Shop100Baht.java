import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		Product sold = new Product();
		
		int buttonConfirm = JOptionPane.showConfirmDialog(null, "Pattanakarn?");
		if(buttonConfirm == 0) {
			sold = new PattanakarnBranch();
		}
		
		int numberProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"));

		sold.setUnit(numberProduct);
		
		JOptionPane.showMessageDialog(null, sold); //sold.toString()
	}

}
