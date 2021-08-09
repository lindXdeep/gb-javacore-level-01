package io.lindx.chat.client;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Chat client module.
 */
public class App extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    primaryStage.show();
    
  }
}