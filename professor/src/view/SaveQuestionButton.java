import javax.swing.*;
import java.awt.*;

public class SaveQuestionButton extends JFrame {

    private JTextArea textArea;
    private JButton btn;

    public SaveQuestionButton() {
        super("Professor");
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Save Question");

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
