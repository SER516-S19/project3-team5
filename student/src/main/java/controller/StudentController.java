package controller;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StudentController {

	public static Map<Integer,ArrayList> updateQuizPage() throws Exception {
		System.out.println("In update Quiz");
		JSONParser parser = new JSONParser();

		Map<Integer,ArrayList> questionMap = new HashMap<>();
		try {

			Object obj = parser.parse(new FileReader("C:\\SER516\\project3-team5\\quizzes\\SampleQuiz.json"));

			JSONObject jsonObject = (JSONObject) obj;

			JSONArray questions = (JSONArray) jsonObject.get("questions");

			for (int i = 0; i < questions.size(); i++) {
                ArrayList<String> al = new ArrayList<>();
				JSONObject question = (JSONObject) questions.get(i);
				String questionTitle = (String) question.get("title");
				ArrayList options = (ArrayList) question.get("options");
				String correctAnswer = (String) question.get("correctAnswer");

				al.add(questionTitle);
				for(int k=0;k<options.size();k++)
					al.add(options.get(k).toString());
				al.add(correctAnswer);
				questionMap.put(i,al);
            }

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return questionMap;
	}
}
