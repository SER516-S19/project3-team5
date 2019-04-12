package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 * Class to select Quiz using a File Chooser
 * @author narenkumarkonchada
 * @version 1.0
 * @since 04/03/2019
 * 
 */
public class StudentSelectQuiz extends JPanel implements ActionListener {

    static JLabel messageLabel;
    static String filePath;
    private StudentUI student;

    /**
     *  Getter for filepath
     * @return
     */
    public static String getPath() {
        return filePath;
    }

    /**
     * Setter for filepath
     * @param path
     */
    public void setPath(String path) {
        this.filePath = path;
    }

    /**
     * Default Constructor
     *
     * @param studentUI - get the StudentUI object
     */
    StudentSelectQuiz(StudentUI studentUI)
    {
        super();

        this.student=studentUI;
        // button to open open dialog
        JButton selectQuizButton = new JButton("Select Quiz");
        selectQuizButton.addActionListener(this);
        JPanel selectQuizPanel = new JPanel();
        selectQuizPanel.add(selectQuizButton);
        messageLabel = new JLabel("no file selected");
        selectQuizPanel.add(messageLabel);
        this.add(selectQuizPanel, BorderLayout.CENTER);
    }

    /**
     * called when select Quiz Button is tapped
     *
     * @param evt - triggered by the file select button
     */
    public void actionPerformed(ActionEvent evt)
    { 
        // if the user presses the save button show the open dialog 
        String command = evt.getActionCommand();
  
        if (command.equals("Select Quiz")) {
            JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.setDialogTitle("Select a .json file");

             // only allow files of .json extension 
            FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .json files", "json");
            fileChooser.addChoosableFileFilter(restrict);
            int fileChooserVal = fileChooser.showOpenDialog(null);
   
            if (fileChooserVal == JFileChooser.APPROVE_OPTION) {
                 student.startQuizPage();
                 messageLabel.setText(fileChooser.getSelectedFile().getAbsolutePath());
                 filePath = fileChooser.getSelectedFile().getAbsolutePath();
                 setPath(filePath);
            }
            else
                messageLabel.setText("the user cancelled the operation");
        } 
    } 
}





