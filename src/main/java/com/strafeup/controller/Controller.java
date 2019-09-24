package com.strafeup.controller;

import com.strafeup.Questions.Question;
import com.strafeup.Questions.QuestionSet;
import com.strafeup.Service.QuestionScramblerService;
import com.strafeup.view.View;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Controller {

  private QuestionScramblerService questionScramblerService;
  private View view;

  public void execute(){

    int limit = 100;
    QuestionSet questionSet = questionScramblerService.createQuestionSet(limit);
    ArrayList<Question> result = questionScramblerService.scramble(questionSet);

    view.printQuestions(result);
  }

}
