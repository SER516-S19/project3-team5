package view;

import javax.sound.sampled.BooleanControl;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QuizSelectionPanel extends JPanel{
    private List<String> quizNames = new ArrayList<>();
    private JPanel quizzesPane = new JPanel();
    private JPanel buttonPane = new JPanel();
    public QuizSelectionPanel(){
        super();
        setLayout(new BorderLayout());
        //TODO: replace with function call to grab quizzes available in appropriate directory.
        quizNames.add("super fun quiz");
        quizNames.add("super hard quiz");
        quizNames.add("This looks better with a third quiz.");

        addQuizzesPane();
        addButtonPane();
    }

    private void addQuizzesPane(){
        quizzesPane.setLayout(new BoxLayout(quizzesPane, BoxLayout.Y_AXIS));
        quizzesPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel availableQuizzesLbl = new JLabel("Available Quizzes");
        availableQuizzesLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        quizzesPane.add(new JLabel("Available Quizzes"));
        for (String title : quizNames){
            JButton button = new JButton(title);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            quizzesPane.add(new JButton(title));
        }
        add(quizzesPane, BorderLayout.CENTER);
    }

    private void addButtonPane(){
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JButton selectQuizButton = new JButton("Select Quiz");
        selectQuizButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        buttonPane.add(new JButton("Select Quiz"));
        add(buttonPane, BorderLayout.PAGE_END);
    }
}
