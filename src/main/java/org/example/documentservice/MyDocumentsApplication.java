package org.example.documentservice;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.documentservice.controller.MainController;
import org.example.documentservice.service.DocumentService;
import org.example.documentservice.ui.MainUI;

public class MyDocumentsApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        DocumentService documentService = new DocumentService();
        MainController mainController = new MainController(documentService);
        MainUI mainUI = new MainUI(mainController);

        mainUI.start(primaryStage);
    }
}
