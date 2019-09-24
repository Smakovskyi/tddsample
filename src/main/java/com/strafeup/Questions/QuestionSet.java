package com.strafeup.Questions;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionSet {
  private ArrayList<Question> categoryA = new ArrayList<>();
  private ArrayList<Question> categoryB = new ArrayList<>();
  private ArrayList<Question> categoryC = new ArrayList<>();
}
