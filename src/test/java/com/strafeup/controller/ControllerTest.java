package com.strafeup.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.strafeup.Service.QuestionScramblerService;
import com.strafeup.view.View;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ControllerTest {

  @Test
  void execute() {
    QuestionScramblerService service = Mockito.mock(QuestionScramblerService.class);
    View view = Mockito.mock(View.class);

    Controller controller = new Controller(service,view);
    controller.execute();
  }
}