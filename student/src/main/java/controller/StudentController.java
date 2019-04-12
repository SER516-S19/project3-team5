package controller;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import main.java.model.Question;
import main.java.model.QuestionImpl;

/**
 * Class that handles JSON -> DAO work
 * @author Cecilia La Place
 * @version 1.0
 * @since 4/11/2019
 *
 */

public class StudentController {
	QuestionImpl quiz;

	public static QuestionImpl updateQuizPage() throws Exception {
		System.out.println("In update Quiz");
		try{
			JSONParser parser = new JSONParser();
			String path = view.StudentSelectQuiz.getPath();
			JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(path));
			JSONArray jQuestions = (JSONArray) jsonObject.get("questions");
			ArrayList<Question> questions = new ArrayList<>();
			for (int i = 0; i < jQuestions.size(); i++) {
	            JSONObject jQues = (JSONObject) jQuestions.get(i);
	            String title = (String) jQues.get("title");
				ArrayList options = (ArrayList) jQues.get("options");
				ArrayList<String> opt = new ArrayList<String>();
				for(int k=0;k<options.size();k++)
					opt.add(options.get(k).toString());
				String answer = (String) jQues.get("correctAnswer");
	            Question q = new Question(title, opt, answer);
	            questions.add(q);
	        }
		        return new QuestionImpl(questions);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
