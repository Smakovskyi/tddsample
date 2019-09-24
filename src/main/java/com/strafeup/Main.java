package com.strafeup;


import com.strafeup.Questions.Category;
import com.strafeup.Questions.Question;
import com.strafeup.Service.QuestionScramblerService;

import com.strafeup.controller.Controller;
import com.strafeup.view.View;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QuestionScramblerService questionScramblerService = new QuestionScramblerService();
        View view = new View();
        Controller controller = new Controller(questionScramblerService, view);
        controller.execute();
    }
}
