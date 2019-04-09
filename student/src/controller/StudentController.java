package controller;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class StudentController {
	
	public static void updateQuizPage() throws Exception
	{
		System.out.println("In update Quiz");
		JSONParser parser = new JSONParser();
		try {

            Object obj = parser.parse(new FileReader("C:\\SER516\\SampleQuiz.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
            
            JSONArray questions = (JSONArray) jsonObject.get("questions");
            Iterator<String> iterator = questions.iterator();
            while (iterator.hasNext()) {
            	JSONArray options = (JSONArray) jsonObject.get("options");
            	Iterator<String> iterator1 = options.iterator();
            	 while (iterator1.hasNext()) {
            		 System.out.println(iterator1.next());
            	 }
            	 
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