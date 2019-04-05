package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class RadioButton extends JButton {
	
	JRadioButton jRadioButton1;
	JRadioButton jRadioButton2;
	JRadioButton jRadioButton3;
	JRadioButton jRadioButton4;
	
	JButton jButton;
	
	ButtonGroup G1; 
	
	public RadioButton() {
		
		this.setLayout(null);
		jRadioButton1 = new JRadioButton();
		jRadioButton2 = new JRadioButton();
		jRadioButton3 = new JRadioButton();
		jRadioButton4 = new JRadioButton();
		
		jButton = new JButton("Save");
		
		G1 = new ButtonGroup(); 
		JLabel L1;
		
		L1 = new JLabel("Question");
		jRadioButton1.setText("A"); 
		jRadioButton2.setText("B"); 
		jRadioButton3.setText("C"); 
		jRadioButton4.setText("D"); 	
		
		jButton.setBounds(125, 90, 80, 30); 
		   
        L1.setBounds(20, 30, 150, 50); 
        
        this.add(jRadioButton1); 
        this.add(jRadioButton2); 
        this.add(jRadioButton3); 
        this.add(jRadioButton4);
        
        this.add(jButton);         
        this.add(L1); 
        
        G1.add(jRadioButton1); 
        G1.add(jRadioButton2); 
        G1.add(jRadioButton3); 
        G1.add(jRadioButton4); 
        
        addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

	}

}
