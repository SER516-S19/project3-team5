package view;
import javax.swing.*;

public class studentUI extends JFrame {
    public studentUI(){
        super("Quiz Taker");
        setSize(600, 800);
        setLayout(null);
        setVisible(true);
        //TODO: The quiz selection panel needs to be added here.
    }

    public static void main(String[] args){
        new studentUI();
    }
}
