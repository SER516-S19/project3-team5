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
	 // Jlabel to show the files user selects 
    static JLabel l;
    private StudentUI student;

    public static String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    static String path;
//    JFrame studentFrame;
    // a default constructor 
    StudentSelectQuiz(StudentUI studentUI)
    {
        super();

        this.student=studentUI;
        // button to open open dialog
        JButton button2 = new JButton("Select Quiz");

        // make an object of the class file chooser
        //StudentSelectQuiz f1 = new StudentSelectQuiz();

        // add action listener to the button to capture user
        // response on buttons
        button2.addActionListener(this);

        // make a panel to add the buttons and labels
        JPanel p = new JPanel();

        // add buttons to the frame
        p.add(button2);

        // set the label to its initial value
        l = new JLabel("no file selected");

        // add panel to the frame
        p.add(l);
        this.add(p, BorderLayout.CENTER);
    }


    public void actionPerformed(ActionEvent evt)
    { 
        // if the user presses the save button show the open dialog 
        String com = evt.getActionCommand(); 
  
        if (com.equals("Select Quiz")) { 
        	 JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 
        	  
             // restrict the user to select files of all types 
             j.setAcceptAllFileFilterUsed(false); 
   
             // set a title for the dialog 
             j.setDialogTitle("Select a .json file"); 
   
             // only allow files of .json extension 
             FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .json files", "json"); 
             j.addChoosableFileFilter(restrict); 
   
             // invoke the showsOpenDialog function to show the save dialog 
             int r = j.showOpenDialog(null); 
   
             // if the user selects a file 
             if (r == JFileChooser.APPROVE_OPTION) { 
                 // set the label to the path of the selected file
//                 this.studentFrame.revalidate();
//                 this.studentFrame.repaint();
//
                 student.startQuizPage();
                 //this.add(new StartQuizPanel());
                // this.revalidate();
                // this.repaint();
                 l.setText(j.getSelectedFile().getAbsolutePath());
                 path = j.getSelectedFile().getAbsolutePath();
                 setPath(path);
                 System.out.println(j.getSelectedFile().getAbsolutePath());
             } 
             // if the user cancelled the operation 
             else
                 l.setText("the user cancelled the operation"); 
        } 
    } 
}





