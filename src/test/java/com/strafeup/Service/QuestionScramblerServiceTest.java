package com.strafeup.Service;


import com.strafeup.Questions.Category;
import com.strafeup.Questions.Question;

import com.strafeup.Questions.QuestionSet;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class QuestionScramblerServiceTest {


    @Test
    public void shouldReturnScrambledQueriesWithAllCategories() {
        QuestionScramblerService service = new QuestionScramblerService();
        QuestionSet questionSet = createQuestionsSet();

        ArrayList<Question> scrambledQueries = service.scramble(questionSet);

        assertThat(scrambledQueries, containsInAnyOrder(
            hasProperty("category", is(Category.A)),
            hasProperty("category", is(Category.B)),
            hasProperty("category", is(Category.C))
            )
        );
    }

    private QuestionSet createQuestionsSet() {
        QuestionSet questionSet = new QuestionSet();

        for (int i = 0; i < 5; i++) {
            questionSet.getCategoryA().add(new Question("Category A question number: " + (i+1) , Category.A));
            questionSet.getCategoryB().add(new Question("Category B question number: " + (i+1), Category.B));
            questionSet.getCategoryC().add(new Question("Category C question number: " + (i+1),Category.C));
        }
        return questionSet;
    }
}