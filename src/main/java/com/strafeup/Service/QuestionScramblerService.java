package com.strafeup.Service;


import com.strafeup.Questions.Category;
import com.strafeup.Questions.Question;

import com.strafeup.Questions.QuestionSet;
import java.util.ArrayList;
import java.util.Random;

public class QuestionScramblerService {

    public QuestionSet createQuestionSet(int limit) {
        QuestionSet questionSet = new QuestionSet();

        for (int i = 0; i < limit; i++) {
            questionSet.getCategoryA().add(new Question("Category A question number: " + (i+1), Category.A));
            questionSet.getCategoryB().add(new Question("Category B question number: " + (i+1), Category.B));
            questionSet.getCategoryC().add(new Question("Category C question number: " + (i+1),Category.C));
        }
        return questionSet;
    }

    public ArrayList<Question> scramble(QuestionSet questionSet) {
        ArrayList<Question> examQuestions = new ArrayList<>();
        Random random = new Random();

        examQuestions.add(questionSet.getCategoryA().get(
            random.nextInt(questionSet.getCategoryA().size()-1)));
        examQuestions.add(questionSet.getCategoryB().get(random.nextInt(
            questionSet.getCategoryA().size()-1)));
        examQuestions.add(questionSet.getCategoryC().get(random.nextInt(
            questionSet.getCategoryA().size()-1)));

        return examQuestions;
    }


}
