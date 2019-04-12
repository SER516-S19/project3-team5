package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class that provides UI for starting the quiz
 * @author Archana Madhavan,narenkumarkonchada
 * @version 1.1
 * @since 4/10/2019
 *
 */
public class StartQuizPanel extends JPanel{
    private StudentUI student;

    public StartQuizPanel(StudentUI studentUI) {
        super();
        this.student = studentUI;
        String name ="start quiz";
        JButton startButton = new JButton(name);

        //sets the format for start button
        startButton.setBounds(50, 100, 95, 30);
        startButton.setLayout(null);
        startButton.setVisible(true);
        startButton.setBackground(Color.RED);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        this.add(startButton);
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    student.setQuiz(controller.StudentController.updateQuizPage());
                    student.openAttemptQuizPage();

                }
                catch(Exception ae)
                {
                    ae.printStackTrace();
                }
            }
        });
    }

}
