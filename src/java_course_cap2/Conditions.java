import javax.swing.JOptionPane;

package java_course_cap2;

public class Conditions {

	public static void main (String args[]) {
		
		int c=0;
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu numero"));
		
		if(c<=5) {
			JOptionPane.showMessageDialog(null,"Seu Numero e menor ou igual a cinco");
		}else {
			JOptionPane.showMessageDialog(null,"Seu Numero e maior que cinco");
		}
		
		
	}
	
}
