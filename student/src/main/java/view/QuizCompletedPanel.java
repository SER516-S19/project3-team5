package view;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * Displays after a quiz is completed.
 *
 * @author Siva Pranav Mandadi, David Lahtinen, narenkumarkonchada
 * @version 1.1
 * 
 */

public class QuizCompletedPanel extends JPanel{
    private StudentUI student;

	/**
	 * Default Constructor
	 * @param studentFrame - getting the studentUI object
	 */
	public QuizCompletedPanel(StudentUI studentFrame){
        super();
        student = studentFrame;
		JLabel label = new JLabel("Quiz has been completed");
        add(label);
		setOpaque(true);
		setVisible(true);
	}
}