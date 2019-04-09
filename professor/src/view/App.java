package gui;
import javax.swing.SwingUtilities;

/*
Name: Hsin-Jung Lee
Version: 3
 */

public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SaveQuestionButton();
			}
		});	
	}

}
