import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class show SaveQuestionButton and actionlistener
 * Author: Hsin-Jung Lee
 * Version: 4
 */


public class SaveQuestionButton {
    static JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                displaySaveQuestionButton();
            }
        });
    }

    static void displaySaveQuestionButton() {
        frame = new JFrame("Professor");

        // create our jbutton
        JButton saveQuestionButton = new JButton("Save Question");

        // add the listener to the jbutton to handle the "pressed" event
        saveQuestionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // display/center the jdialog when the button is pressed
                JDialog saveQuestion = new JDialog(frame, "Save Question", true);
                saveQuestion.setLocationRelativeTo(frame);
                saveQuestion.setVisible(true);
            }
        });

        // put the button on the frame
        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(saveQuestionButton);

        // set up the jframe, then display it
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}