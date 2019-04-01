import javax.swing.*;

public class GiveUpButton extends JButton {
    public GiveUpButton(){
        super("Give Up.");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}