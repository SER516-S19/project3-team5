package controller;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StudentController {
	
	public static void updateQuizPage() throws Exception
	{
		System.out.println("In update Quiz");
		JSONParser parser = new JSONParser();
		try {

            Object obj = parser.parse(new FileReader("C:\\Users\\Arch\\Documents\\GitHub\\project3-team5\\quizzes\\SampleQuiz.json"));

            JSONObject jsonObject = (JSONObject) obj;
                      
            JSONArray questions= (JSONArray)jsonObject.get("questions");
            for(int i=0;i<questions.size();i++) {
            	JSONObject question=(JSONObject)questions.get(i);
            	ArrayList options=(ArrayList)question.get("options");
            	System.out.println(options);
            	String questionTitle=(String)question.get("title");
            	System.out.println(questionTitle);
            	String correctAnswer=(String)question.get("correctAnswer");
            	System.out.println(correctAnswer);
           }
            	
      	 
            }
            
		catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
}
	}