package view;

import java.awt.Dimension;

import javax.swing.*;


/**
 * Class to create Professor UI Frame and add all panels in the frame
 * @author: Naren kumar Konchada
 * @since:  04/01/2019
*/
public class professorUI extends JFrame {
    
    //title of the Frame
    private static final String FRAME_TITLE = "Professor";
    
    professorUI() {
        
        //setup Frame UI
        this.setTitle(FRAME_TITLE);
        this.setMinimumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new CreateQuestionPanel());
        
        //Display the Frame
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {

        new professorUI();
    }
}