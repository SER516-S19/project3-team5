package view;

import javax.swing.*;
import java.awt.*;

public class CreateQuestionPanel extends JPanel{
    public CreateQuestionPanel(){
        super();
        setLayout(new BorderLayout());
        JPanel questionPanel = new JPanel();
        questionPanel.setPreferredSize(new Dimension(600, 75));
        //TODO: add Create Question Text Field from task#10
        add(questionPanel, BorderLayout.NORTH);
        
        JScrollPane answersPanel = new JScrollPane();
        //TODO: create checkboxes from task#21
        //TODO: show answer text for task#22
        add(answersPanel, BorderLayout.CENTER);

        JPanel buttonsAndQuizNamePane = new JPanel();
        buttonsAndQuizNamePane.setLayout(new GridLayout(2, 2));
        buttonsAndQuizNamePane.setPreferredSize(new Dimension(600, 75));
        //TODO: add add answer button from task#18
        //TODO: add save question button from task#17
        //TODO: add quiz name text field from task#8
        //TODO: create save quiz button from task#12
        add(buttonsAndQuizNamePane, BorderLayout.SOUTH);
    }
}
