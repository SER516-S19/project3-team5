package view;
import javax.swing.*;

public class studentUI JFrame {
    public studentUI(){
        JFrame studentApp = new JFrame();
        studentApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentApp.setSize(800, 600);
        studentApp.setTitle("Student Quiz Taker");
        studentApp.setLayout(new BorderLayout());
        JPanel quizPanel = new JPanel(new BorderLayout());
        studentApp.add(quizPanel, BorderLayout.CENTER);
        studentApp.setVisible(true);
    }

    public static void main(String[] args){
        new studentUI();
    }
}
