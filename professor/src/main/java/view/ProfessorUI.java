package view;

import java.awt.Dimension;
import view.CreateQuestionPanel;
import javax.swing.*;

/**
 * Class to create Professor UI Frame and add all panels in the frame
 * @author narenkumarkonchada
 * @version 1.1
 * @since 04/02/2019
 *
 */
public class ProfessorUI extends JFrame {
    
    public ProfessorUI() {
        
        //setup Frame UI
        this.setTitle("Quiz Maker");
        this.setMinimumSize(new Dimension(800, 400));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new CreateQuestionPanel());
        
        //Display the Frame
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ProfessorUI();
    }
}