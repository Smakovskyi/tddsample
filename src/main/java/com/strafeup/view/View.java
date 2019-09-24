package com.strafeup.view;

import com.strafeup.Questions.Question;
import java.util.ArrayList;

public class View {

  public void printQuestions(ArrayList<Question> result) {
    for (Question question: result) {
      System.out.println(question.getText());
    }
  }
}
