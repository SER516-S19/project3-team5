package main.java.utilities;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.fasterxml.jackson.databind.ObjectMapper;

//import model.Question;
import main.java.model.QuestionImpl;

/**
 * Read README.md file to get rid of the errors.
 * JsonUtility class has method to convert an object to Json and store it in file.
 * 
 * @author      Aravinda Sai Kondamari, narenkumarKonchada
 * @version     1.1
 * @since       04/11/2019
 */

public class JsonUtility {

	/**
	 * This method accepts a QuestionImpl object converts it in to Json and stores
	 * in a file with the name from "title" parameter.
	 * 
	 * @param questions
	 * @param title
	 */
    public static void writeToJson(QuestionImpl questions, String title){
            ObjectMapper objectMapper = new ObjectMapper();

            String filePath = "../quizzes/"+ title + ".json";
            try {
            	File newFile = new File(filePath);
//				JOptionPane.showMessageDialog(null,newFile.getPath());//(newFile.getPath());
            	newFile.createNewFile();
				objectMapper.writeValue(newFile, questions);
				//System.out.println("newfile created" + filePath);
			} catch (IOException e) {
				System.out.println("Exception while generating file.");
				e.printStackTrace();
			}
    }
}
